/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.graph.odata;

import com.microsoft.graph.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.odata.*;
import com.microsoft.services.odata.Readable;
import com.microsoft.services.odata.interfaces.*;

/**
 * The type  DirectoryRoleFetcher.
 */
public class DirectoryRoleFetcher extends ODataEntityFetcher<DirectoryRole,DirectoryRoleOperations> 
                                     implements Readable<DirectoryRole> {

     /**
     * Instantiates a new DirectoryRoleFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public DirectoryRoleFetcher(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent, DirectoryRole.class, DirectoryRoleOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public DirectoryRoleFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public DirectoryRoleFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

        
     /**
     * Gets members.
     *
     * @return the members
     */
    public ODataCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations> getMembers() {
        return new ODataCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("members", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class);
    }

    /**
     * Gets member.
     *
     * @return the member
     */
    public DirectoryObjectFetcher getMember(String id){
         return new ODataCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("members", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class).getById(id);
    }

     /**
     * Gets member of.
     *
     * @return the member of
     */
    public ODataCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations> getMemberOf() {
        return new ODataCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("memberOf", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class);
    }

    /**
     * Gets member of.
     *
     * @return the member of
     */
    public DirectoryObjectFetcher getMemberOf(String id){
         return new ODataCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("memberOf", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class).getById(id);
    }

     /**
     * Gets owners.
     *
     * @return the owners
     */
    public ODataCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations> getOwners() {
        return new ODataCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("owners", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class);
    }

    /**
     * Gets owner.
     *
     * @return the owner
     */
    public DirectoryObjectFetcher getOwner(String id){
         return new ODataCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("owners", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class).getById(id);
    }

     /**
     * Gets owned objects.
     *
     * @return the owned objects
     */
    public ODataCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations> getOwnedObjects() {
        return new ODataCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("ownedObjects", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class);
    }

    /**
     * Gets owned object.
     *
     * @return the owned object
     */
    public DirectoryObjectFetcher getOwnedObject(String id){
         return new ODataCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("ownedObjects", this, DirectoryObject.class, DirectoryObjectCollectionOperations.class).getById(id);
    }

}
