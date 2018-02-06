/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.ketal.cornerstone.persistence.jpa.controller;

import java.util.List;

import javax.persistence.metamodel.SingularAttribute;

public interface JpaController<T> {

    abstract Object getPrimaryKey(T entity);
    
    /*
     * return converted object which is primary key type
     */
    abstract Object convertToPrimaryKeyType(Object id);

    public List<T> getAll();
    
    public List<T> get(int maxResults, int firstResult);
    
    public T find(T entity);
    
    public T findByPrimaryKey(Object entity);
    
    public List<T> findBy(SingularAttribute<T, ?> field, Object value);

    public T create(T entity);
    
    public T update(T entity);

    public T delete(T entity);

}
