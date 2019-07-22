(ns com.google.cloud.compute.v1.BackendServiceClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
    ProjectGlobalBackendServiceName backendService = ProjectGlobalBackendServiceName.of(\"[PROJECT]\", \"[BACKEND_SERVICE]\");
    SignedUrlKey signedUrlKeyResource = SignedUrlKey.newBuilder().build();
    Operation response = backendServiceClient.addSignedUrlKeyBackendService(backendService, signedUrlKeyResource);
  }

  Note: close() needs to be called on the backendServiceClient object to clean up resources such
  as threads. In the example above, try-with-resources is used, which automatically calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of BackendServiceSettings to
  create(). For example:

  To customize credentials:



  BackendServiceSettings backendServiceSettings =
      BackendServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  BackendServiceClient backendServiceClient =
      BackendServiceClient.create(backendServiceSettings);

  To customize the endpoint:



  BackendServiceSettings backendServiceSettings =
      BackendServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  BackendServiceClient backendServiceClient =
      BackendServiceClient.create(backendServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendServiceClient]))

(defn *create
  "Constructs an instance of BackendServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.BackendServiceSettings`

  returns: `com.google.cloud.compute.v1.BackendServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.BackendServiceClient [^com.google.cloud.compute.v1.BackendServiceSettings settings]
    (BackendServiceClient/create settings))
  (^com.google.cloud.compute.v1.BackendServiceClient []
    (BackendServiceClient/create )))

(defn list-backend-services-paged-callable
  "Retrieves the list of BackendService resources available to the specified project.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListBackendServicesHttpRequest request = ListBackendServicesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListBackendServicesPagedResponse> future = backendServiceClient.listBackendServicesPagedCallable().futureCall(request);
     // Do something
     for (BackendService element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceClient$ListBackendServicesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceClient this]
    (-> this (.listBackendServicesPagedCallable))))

(defn aggregated-list-backend-services
  "Retrieves the list of all BackendService resources, regional and global, available to the
   specified project.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (BackendServicesScopedList element : backendServiceClient.aggregatedListBackendServices(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Name of the project scoping this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.BackendServiceClient$AggregatedListBackendServicesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.BackendServiceClient$AggregatedListBackendServicesPagedResponse [^BackendServiceClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListBackendServices project))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.BackendServiceSettings`"
  (^com.google.cloud.compute.v1.BackendServiceSettings [^BackendServiceClient this]
    (-> this (.getSettings))))

(defn get-health-backend-service
  "Gets the most recent health check results for this BackendService.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     ProjectGlobalBackendServiceName backendService = ProjectGlobalBackendServiceName.of(\"[PROJECT]\", \"[BACKEND_SERVICE]\");
     ResourceGroupReference resourceGroupReferenceResource = ResourceGroupReference.newBuilder().build();
     BackendServiceGroupHealth response = backendServiceClient.getHealthBackendService(backendService, resourceGroupReferenceResource);
   }

  backend-service - Name of the BackendService resource to which the queried instance belongs. - `com.google.cloud.compute.v1.ProjectGlobalBackendServiceName`
  resource-group-reference-resource - `com.google.cloud.compute.v1.ResourceGroupReference`

  returns: `com.google.cloud.compute.v1.BackendServiceGroupHealth`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.BackendServiceGroupHealth [^BackendServiceClient this ^com.google.cloud.compute.v1.ProjectGlobalBackendServiceName backend-service ^com.google.cloud.compute.v1.ResourceGroupReference resource-group-reference-resource]
    (-> this (.getHealthBackendService backend-service resource-group-reference-resource)))
  (^com.google.cloud.compute.v1.BackendServiceGroupHealth [^BackendServiceClient this ^com.google.cloud.compute.v1.GetHealthBackendServiceHttpRequest request]
    (-> this (.getHealthBackendService request))))

(defn add-signed-url-key-backend-service-callable
  "Adds a key for validating requests with signed URLs for this backend service.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     String formattedBackendService = ProjectGlobalBackendServiceName.format(\"[PROJECT]\", \"[BACKEND_SERVICE]\");
     SignedUrlKey signedUrlKeyResource = SignedUrlKey.newBuilder().build();
     AddSignedUrlKeyBackendServiceHttpRequest request = AddSignedUrlKeyBackendServiceHttpRequest.newBuilder()
       .setBackendService(formattedBackendService)
       .setSignedUrlKeyResource(signedUrlKeyResource)
       .build();
     ApiFuture<Operation> future = backendServiceClient.addSignedUrlKeyBackendServiceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddSignedUrlKeyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceClient this]
    (-> this (.addSignedUrlKeyBackendServiceCallable))))

(defn insert-backend-service-callable
  "Creates a BackendService resource in the specified project using the data included in the
   request. There are several restrictions and guidelines to keep in mind when creating a backend
   service. Read Restrictions and Guidelines for more information.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     BackendService backendServiceResource = BackendService.newBuilder().build();
     InsertBackendServiceHttpRequest request = InsertBackendServiceHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setBackendServiceResource(backendServiceResource)
       .build();
     ApiFuture<Operation> future = backendServiceClient.insertBackendServiceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceClient this]
    (-> this (.insertBackendServiceCallable))))

(defn get-backend-service
  "Returns the specified BackendService resource. Gets a list of available backend services.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     ProjectGlobalBackendServiceName backendService = ProjectGlobalBackendServiceName.of(\"[PROJECT]\", \"[BACKEND_SERVICE]\");
     BackendService response = backendServiceClient.getBackendService(backendService);
   }

  backend-service - Name of the BackendService resource to return. - `com.google.cloud.compute.v1.ProjectGlobalBackendServiceName`

  returns: `com.google.cloud.compute.v1.BackendService`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.BackendService [^BackendServiceClient this ^com.google.cloud.compute.v1.ProjectGlobalBackendServiceName backend-service]
    (-> this (.getBackendService backend-service))))

(defn delete-backend-service-callable
  "Deletes the specified BackendService resource.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     String formattedBackendService = ProjectGlobalBackendServiceName.format(\"[PROJECT]\", \"[BACKEND_SERVICE]\");
     DeleteBackendServiceHttpRequest request = DeleteBackendServiceHttpRequest.newBuilder()
       .setBackendService(formattedBackendService)
       .build();
     ApiFuture<Operation> future = backendServiceClient.deleteBackendServiceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceClient this]
    (-> this (.deleteBackendServiceCallable))))

(defn update-backend-service-callable
  "Updates the specified BackendService resource with the data included in the request. There are
   several restrictions and guidelines to keep in mind when updating a backend service. Read
   Restrictions and Guidelines for more information.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     String formattedBackendService = ProjectGlobalBackendServiceName.format(\"[PROJECT]\", \"[BACKEND_SERVICE]\");
     BackendService backendServiceResource = BackendService.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     UpdateBackendServiceHttpRequest request = UpdateBackendServiceHttpRequest.newBuilder()
       .setBackendService(formattedBackendService)
       .setBackendServiceResource(backendServiceResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = backendServiceClient.updateBackendServiceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceClient this]
    (-> this (.updateBackendServiceCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.BackendServiceStub`"
  ([^BackendServiceClient this]
    (-> this (.getStub))))

(defn insert-backend-service
  "Creates a BackendService resource in the specified project using the data included in the
   request. There are several restrictions and guidelines to keep in mind when creating a backend
   service. Read Restrictions and Guidelines for more information.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     BackendService backendServiceResource = BackendService.newBuilder().build();
     Operation response = backendServiceClient.insertBackendService(project, backendServiceResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  backend-service-resource - A BackendService resource. This resource defines a group of backend virtual machines and their serving capacity. (== resource_for v1.backendService ==) (== resource_for beta.backendService ==) - `com.google.cloud.compute.v1.BackendService`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^BackendServiceClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.BackendService backend-service-resource]
    (-> this (.insertBackendService project backend-service-resource)))
  (^com.google.cloud.compute.v1.Operation [^BackendServiceClient this ^com.google.cloud.compute.v1.InsertBackendServiceHttpRequest request]
    (-> this (.insertBackendService request))))

(defn aggregated-list-backend-services-callable
  "Retrieves the list of all BackendService resources, regional and global, available to the
   specified project.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListBackendServicesHttpRequest request = AggregatedListBackendServicesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       BackendServiceAggregatedList response = backendServiceClient.aggregatedListBackendServicesCallable().call(request);
       for (BackendServicesScopedList element : response.getItemsMap()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceClient this]
    (-> this (.aggregatedListBackendServicesCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^BackendServiceClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^BackendServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn patch-backend-service-callable
  "Patches the specified BackendService resource with the data included in the request. There are
   several restrictions and guidelines to keep in mind when updating a backend service. Read
   Restrictions and Guidelines for more information. This method supports PATCH semantics and uses
   the JSON merge patch format and processing rules.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     String formattedBackendService = ProjectGlobalBackendServiceName.format(\"[PROJECT]\", \"[BACKEND_SERVICE]\");
     BackendService backendServiceResource = BackendService.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     PatchBackendServiceHttpRequest request = PatchBackendServiceHttpRequest.newBuilder()
       .setBackendService(formattedBackendService)
       .setBackendServiceResource(backendServiceResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = backendServiceClient.patchBackendServiceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceClient this]
    (-> this (.patchBackendServiceCallable))))

(defn shutdown
  ""
  ([^BackendServiceClient this]
    (-> this (.shutdown))))

(defn update-backend-service
  "Updates the specified BackendService resource with the data included in the request. There are
   several restrictions and guidelines to keep in mind when updating a backend service. Read
   Restrictions and Guidelines for more information.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     ProjectGlobalBackendServiceName backendService = ProjectGlobalBackendServiceName.of(\"[PROJECT]\", \"[BACKEND_SERVICE]\");
     BackendService backendServiceResource = BackendService.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = backendServiceClient.updateBackendService(backendService, backendServiceResource, fieldMask);
   }

  backend-service - Name of the BackendService resource to update. - `com.google.cloud.compute.v1.ProjectGlobalBackendServiceName`
  backend-service-resource - A BackendService resource. This resource defines a group of backend virtual machines and their serving capacity. (== resource_for v1.backendService ==) (== resource_for beta.backendService ==) - `com.google.cloud.compute.v1.BackendService`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^BackendServiceClient this ^com.google.cloud.compute.v1.ProjectGlobalBackendServiceName backend-service ^com.google.cloud.compute.v1.BackendService backend-service-resource ^java.util.List field-mask]
    (-> this (.updateBackendService backend-service backend-service-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^BackendServiceClient this ^com.google.cloud.compute.v1.UpdateBackendServiceHttpRequest request]
    (-> this (.updateBackendService request))))

(defn list-backend-services
  "Retrieves the list of BackendService resources available to the specified project.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (BackendService element : backendServiceClient.listBackendServices(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.BackendServiceClient$ListBackendServicesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.BackendServiceClient$ListBackendServicesPagedResponse [^BackendServiceClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listBackendServices project))))

(defn list-backend-services-callable
  "Retrieves the list of BackendService resources available to the specified project.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListBackendServicesHttpRequest request = ListBackendServicesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       BackendServiceList response = backendServiceClient.listBackendServicesCallable().call(request);
       for (BackendService element : response.getItemsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceClient this]
    (-> this (.listBackendServicesCallable))))

(defn get-health-backend-service-callable
  "Gets the most recent health check results for this BackendService.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     String formattedBackendService = ProjectGlobalBackendServiceName.format(\"[PROJECT]\", \"[BACKEND_SERVICE]\");
     ResourceGroupReference resourceGroupReferenceResource = ResourceGroupReference.newBuilder().build();
     GetHealthBackendServiceHttpRequest request = GetHealthBackendServiceHttpRequest.newBuilder()
       .setBackendService(formattedBackendService)
       .setResourceGroupReferenceResource(resourceGroupReferenceResource)
       .build();
     ApiFuture<BackendServiceGroupHealth> future = backendServiceClient.getHealthBackendServiceCallable().futureCall(request);
     // Do something
     BackendServiceGroupHealth response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetHealthBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendServiceGroupHealth>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceClient this]
    (-> this (.getHealthBackendServiceCallable))))

(defn aggregated-list-backend-services-paged-callable
  "Retrieves the list of all BackendService resources, regional and global, available to the
   specified project.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListBackendServicesHttpRequest request = AggregatedListBackendServicesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListBackendServicesPagedResponse> future = backendServiceClient.aggregatedListBackendServicesPagedCallable().futureCall(request);
     // Do something
     for (BackendServicesScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceClient$AggregatedListBackendServicesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceClient this]
    (-> this (.aggregatedListBackendServicesPagedCallable))))

(defn close
  ""
  ([^BackendServiceClient this]
    (-> this (.close))))

(defn delete-backend-service
  "Deletes the specified BackendService resource.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     ProjectGlobalBackendServiceName backendService = ProjectGlobalBackendServiceName.of(\"[PROJECT]\", \"[BACKEND_SERVICE]\");
     Operation response = backendServiceClient.deleteBackendService(backendService);
   }

  backend-service - Name of the BackendService resource to delete. - `com.google.cloud.compute.v1.ProjectGlobalBackendServiceName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^BackendServiceClient this ^com.google.cloud.compute.v1.ProjectGlobalBackendServiceName backend-service]
    (-> this (.deleteBackendService backend-service))))

(defn delete-signed-url-key-backend-service-callable
  "Deletes a key for validating requests with signed URLs for this backend service.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     String formattedBackendService = ProjectGlobalBackendServiceName.format(\"[PROJECT]\", \"[BACKEND_SERVICE]\");
     String keyName = \"\";
     DeleteSignedUrlKeyBackendServiceHttpRequest request = DeleteSignedUrlKeyBackendServiceHttpRequest.newBuilder()
       .setBackendService(formattedBackendService)
       .setKeyName(keyName)
       .build();
     ApiFuture<Operation> future = backendServiceClient.deleteSignedUrlKeyBackendServiceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSignedUrlKeyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceClient this]
    (-> this (.deleteSignedUrlKeyBackendServiceCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^BackendServiceClient this]
    (-> this (.isTerminated))))

(defn set-security-policy-backend-service-callable
  "Sets the security policy for the specified backend service.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     String formattedBackendService = ProjectGlobalBackendServiceName.format(\"[PROJECT]\", \"[BACKEND_SERVICE]\");
     SecurityPolicyReference securityPolicyReferenceResource = SecurityPolicyReference.newBuilder().build();
     SetSecurityPolicyBackendServiceHttpRequest request = SetSecurityPolicyBackendServiceHttpRequest.newBuilder()
       .setBackendService(formattedBackendService)
       .setSecurityPolicyReferenceResource(securityPolicyReferenceResource)
       .build();
     ApiFuture<Operation> future = backendServiceClient.setSecurityPolicyBackendServiceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetSecurityPolicyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceClient this]
    (-> this (.setSecurityPolicyBackendServiceCallable))))

(defn set-security-policy-backend-service
  "Sets the security policy for the specified backend service.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     ProjectGlobalBackendServiceName backendService = ProjectGlobalBackendServiceName.of(\"[PROJECT]\", \"[BACKEND_SERVICE]\");
     SecurityPolicyReference securityPolicyReferenceResource = SecurityPolicyReference.newBuilder().build();
     Operation response = backendServiceClient.setSecurityPolicyBackendService(backendService, securityPolicyReferenceResource);
   }

  backend-service - Name of the BackendService resource to which the security policy should be set. The name should conform to RFC1035. - `com.google.cloud.compute.v1.ProjectGlobalBackendServiceName`
  security-policy-reference-resource - `com.google.cloud.compute.v1.SecurityPolicyReference`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^BackendServiceClient this ^com.google.cloud.compute.v1.ProjectGlobalBackendServiceName backend-service ^com.google.cloud.compute.v1.SecurityPolicyReference security-policy-reference-resource]
    (-> this (.setSecurityPolicyBackendService backend-service security-policy-reference-resource)))
  (^com.google.cloud.compute.v1.Operation [^BackendServiceClient this ^com.google.cloud.compute.v1.SetSecurityPolicyBackendServiceHttpRequest request]
    (-> this (.setSecurityPolicyBackendService request))))

(defn patch-backend-service
  "Patches the specified BackendService resource with the data included in the request. There are
   several restrictions and guidelines to keep in mind when updating a backend service. Read
   Restrictions and Guidelines for more information. This method supports PATCH semantics and uses
   the JSON merge patch format and processing rules.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     ProjectGlobalBackendServiceName backendService = ProjectGlobalBackendServiceName.of(\"[PROJECT]\", \"[BACKEND_SERVICE]\");
     BackendService backendServiceResource = BackendService.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = backendServiceClient.patchBackendService(backendService, backendServiceResource, fieldMask);
   }

  backend-service - Name of the BackendService resource to patch. - `com.google.cloud.compute.v1.ProjectGlobalBackendServiceName`
  backend-service-resource - A BackendService resource. This resource defines a group of backend virtual machines and their serving capacity. (== resource_for v1.backendService ==) (== resource_for beta.backendService ==) - `com.google.cloud.compute.v1.BackendService`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^BackendServiceClient this ^com.google.cloud.compute.v1.ProjectGlobalBackendServiceName backend-service ^com.google.cloud.compute.v1.BackendService backend-service-resource ^java.util.List field-mask]
    (-> this (.patchBackendService backend-service backend-service-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^BackendServiceClient this ^com.google.cloud.compute.v1.PatchBackendServiceHttpRequest request]
    (-> this (.patchBackendService request))))

(defn delete-signed-url-key-backend-service
  "Deletes a key for validating requests with signed URLs for this backend service.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     ProjectGlobalBackendServiceName backendService = ProjectGlobalBackendServiceName.of(\"[PROJECT]\", \"[BACKEND_SERVICE]\");
     String keyName = \"\";
     Operation response = backendServiceClient.deleteSignedUrlKeyBackendService(backendService, keyName);
   }

  backend-service - Name of the BackendService resource to which the Signed URL Key should be added. The name should conform to RFC1035. - `com.google.cloud.compute.v1.ProjectGlobalBackendServiceName`
  key-name - The name of the Signed URL Key to delete. - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^BackendServiceClient this ^com.google.cloud.compute.v1.ProjectGlobalBackendServiceName backend-service ^java.lang.String key-name]
    (-> this (.deleteSignedUrlKeyBackendService backend-service key-name)))
  (^com.google.cloud.compute.v1.Operation [^BackendServiceClient this ^com.google.cloud.compute.v1.DeleteSignedUrlKeyBackendServiceHttpRequest request]
    (-> this (.deleteSignedUrlKeyBackendService request))))

(defn get-backend-service-callable
  "Returns the specified BackendService resource. Gets a list of available backend services.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     String formattedBackendService = ProjectGlobalBackendServiceName.format(\"[PROJECT]\", \"[BACKEND_SERVICE]\");
     GetBackendServiceHttpRequest request = GetBackendServiceHttpRequest.newBuilder()
       .setBackendService(formattedBackendService)
       .build();
     ApiFuture<BackendService> future = backendServiceClient.getBackendServiceCallable().futureCall(request);
     // Do something
     BackendService response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendService>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceClient this]
    (-> this (.getBackendServiceCallable))))

(defn shutdown-now
  ""
  ([^BackendServiceClient this]
    (-> this (.shutdownNow))))

(defn add-signed-url-key-backend-service
  "Adds a key for validating requests with signed URLs for this backend service.

   Sample code:



   try (BackendServiceClient backendServiceClient = BackendServiceClient.create()) {
     ProjectGlobalBackendServiceName backendService = ProjectGlobalBackendServiceName.of(\"[PROJECT]\", \"[BACKEND_SERVICE]\");
     SignedUrlKey signedUrlKeyResource = SignedUrlKey.newBuilder().build();
     Operation response = backendServiceClient.addSignedUrlKeyBackendService(backendService, signedUrlKeyResource);
   }

  backend-service - Name of the BackendService resource to which the Signed URL Key should be added. The name should conform to RFC1035. - `com.google.cloud.compute.v1.ProjectGlobalBackendServiceName`
  signed-url-key-resource - Represents a customer-supplied Signing Key used by Cloud CDN Signed URLs - `com.google.cloud.compute.v1.SignedUrlKey`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^BackendServiceClient this ^com.google.cloud.compute.v1.ProjectGlobalBackendServiceName backend-service ^com.google.cloud.compute.v1.SignedUrlKey signed-url-key-resource]
    (-> this (.addSignedUrlKeyBackendService backend-service signed-url-key-resource)))
  (^com.google.cloud.compute.v1.Operation [^BackendServiceClient this ^com.google.cloud.compute.v1.AddSignedUrlKeyBackendServiceHttpRequest request]
    (-> this (.addSignedUrlKeyBackendService request))))

