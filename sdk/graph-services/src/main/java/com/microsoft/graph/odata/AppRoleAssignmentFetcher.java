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
 * The type  AppRoleAssignmentFetcher.
 */
public class AppRoleAssignmentFetcher extends ODataEntityFetcher<AppRoleAssignment,AppRoleAssignmentOperations> 
                                     implements Readable<AppRoleAssignment> {

     /**
     * Instantiates a new AppRoleAssignmentFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public AppRoleAssignmentFetcher(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent, AppRoleAssignment.class, AppRoleAssignmentOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public AppRoleAssignmentFetcher addParameter(String name, Object value) {
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
    public AppRoleAssignmentFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

        
}