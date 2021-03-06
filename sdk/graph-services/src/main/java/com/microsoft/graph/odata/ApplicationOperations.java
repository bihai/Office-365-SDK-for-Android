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
import com.microsoft.services.odata.interfaces.*;
import static com.microsoft.services.odata.Helpers.*;

/**
 * The type ApplicationOperations.
 */
public class ApplicationOperations extends DirectoryObjectOperations {

     /**
      * Instantiates a new ApplicationOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public ApplicationOperations(String urlComponent, ODataExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public ApplicationOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public ApplicationOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
    /**
     * restore listenable future.
     * @param identifierUris the identifierUris 
     * @return the listenable future
     */         
    public ListenableFuture<Application> restore(java.util.List<String> identifierUris) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializedidentifierUris = serializer.serialize(identifierUris);
		  
        
        ListenableFuture<String> future = restoreRaw(serializedidentifierUris);
        return transformToEntityListenableFuture(future, Application.class, getResolver());
        
    }

     /**
     * restoreRaw listenable future.
     * @param identifierUris the identifierUris 
     * @return the listenable future
     */ 
    public ListenableFuture<String> restoreRaw(String identifierUris){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("identifierUris", identifierUris);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("Microsoft.Graph.restore");
        
        ListenableFuture<ODataResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


}
