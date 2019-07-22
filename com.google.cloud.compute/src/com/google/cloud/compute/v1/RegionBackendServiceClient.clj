(ns com.google.cloud.compute.v1.RegionBackendServiceClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
    ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of(\"[PROJECT]\", \"[REGION]\", \"[BACKEND_SERVICE]\");
    Operation response = regionBackendServiceClient.deleteRegionBackendService(backendService);
  }

  Note: close() needs to be called on the regionBackendServiceClient object to clean up
  resources such as threads. In the example above, try-with-resources is used, which automatically
  calls close().

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

  This class can be customized by passing in a custom instance of RegionBackendServiceSettings
  to create(). For example:

  To customize credentials:



  RegionBackendServiceSettings regionBackendServiceSettings =
      RegionBackendServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  RegionBackendServiceClient regionBackendServiceClient =
      RegionBackendServiceClient.create(regionBackendServiceSettings);

  To customize the endpoint:



  RegionBackendServiceSettings regionBackendServiceSettings =
      RegionBackendServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  RegionBackendServiceClient regionBackendServiceClient =
      RegionBackendServiceClient.create(regionBackendServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionBackendServiceClient]))

(defn *create
  "Constructs an instance of RegionBackendServiceClient, using the given settings. The channels
   are created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.RegionBackendServiceSettings`

  returns: `com.google.cloud.compute.v1.RegionBackendServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionBackendServiceClient [^com.google.cloud.compute.v1.RegionBackendServiceSettings settings]
    (RegionBackendServiceClient/create settings))
  (^com.google.cloud.compute.v1.RegionBackendServiceClient []
    (RegionBackendServiceClient/create )))

(defn list-region-backend-services-callable
  "Retrieves the list of regional BackendService resources available to the specified project in
   the given region.

   Sample code:



   try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListRegionBackendServicesHttpRequest request = ListRegionBackendServicesHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     while (true) {
       BackendServiceList response = regionBackendServiceClient.listRegionBackendServicesCallable().call(request);
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionBackendServiceClient this]
    (-> this (.listRegionBackendServicesCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.RegionBackendServiceSettings`"
  (^com.google.cloud.compute.v1.RegionBackendServiceSettings [^RegionBackendServiceClient this]
    (-> this (.getSettings))))

(defn get-health-region-backend-service
  "Gets the most recent health check results for this regional BackendService.

   Sample code:



   try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
     ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of(\"[PROJECT]\", \"[REGION]\", \"[BACKEND_SERVICE]\");
     ResourceGroupReference resourceGroupReferenceResource = ResourceGroupReference.newBuilder().build();
     BackendServiceGroupHealth response = regionBackendServiceClient.getHealthRegionBackendService(backendService, resourceGroupReferenceResource);
   }

  backend-service - Name of the BackendService resource for which to get health. - `com.google.cloud.compute.v1.ProjectRegionBackendServiceName`
  resource-group-reference-resource - `com.google.cloud.compute.v1.ResourceGroupReference`

  returns: `com.google.cloud.compute.v1.BackendServiceGroupHealth`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.BackendServiceGroupHealth [^RegionBackendServiceClient this ^com.google.cloud.compute.v1.ProjectRegionBackendServiceName backend-service ^com.google.cloud.compute.v1.ResourceGroupReference resource-group-reference-resource]
    (-> this (.getHealthRegionBackendService backend-service resource-group-reference-resource)))
  (^com.google.cloud.compute.v1.BackendServiceGroupHealth [^RegionBackendServiceClient this ^com.google.cloud.compute.v1.GetHealthRegionBackendServiceHttpRequest request]
    (-> this (.getHealthRegionBackendService request))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.RegionBackendServiceStub`"
  ([^RegionBackendServiceClient this]
    (-> this (.getStub))))

(defn patch-region-backend-service-callable
  "Updates the specified regional BackendService resource with the data included in the request.
   There are several restrictions and guidelines to keep in mind when updating a backend service.
   Read Restrictions and Guidelines for more information. This method supports PATCH semantics and
   uses the JSON merge patch format and processing rules.

   Sample code:



   try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
     String formattedBackendService = ProjectRegionBackendServiceName.format(\"[PROJECT]\", \"[REGION]\", \"[BACKEND_SERVICE]\");
     BackendService backendServiceResource = BackendService.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     PatchRegionBackendServiceHttpRequest request = PatchRegionBackendServiceHttpRequest.newBuilder()
       .setBackendService(formattedBackendService)
       .setBackendServiceResource(backendServiceResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = regionBackendServiceClient.patchRegionBackendServiceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionBackendServiceClient this]
    (-> this (.patchRegionBackendServiceCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^RegionBackendServiceClient this]
    (-> this (.isShutdown))))

(defn get-health-region-backend-service-callable
  "Gets the most recent health check results for this regional BackendService.

   Sample code:



   try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
     String formattedBackendService = ProjectRegionBackendServiceName.format(\"[PROJECT]\", \"[REGION]\", \"[BACKEND_SERVICE]\");
     ResourceGroupReference resourceGroupReferenceResource = ResourceGroupReference.newBuilder().build();
     GetHealthRegionBackendServiceHttpRequest request = GetHealthRegionBackendServiceHttpRequest.newBuilder()
       .setBackendService(formattedBackendService)
       .setResourceGroupReferenceResource(resourceGroupReferenceResource)
       .build();
     ApiFuture<BackendServiceGroupHealth> future = regionBackendServiceClient.getHealthRegionBackendServiceCallable().futureCall(request);
     // Do something
     BackendServiceGroupHealth response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetHealthRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendServiceGroupHealth>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionBackendServiceClient this]
    (-> this (.getHealthRegionBackendServiceCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^RegionBackendServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn list-region-backend-services-paged-callable
  "Retrieves the list of regional BackendService resources available to the specified project in
   the given region.

   Sample code:



   try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListRegionBackendServicesHttpRequest request = ListRegionBackendServicesHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     ApiFuture<ListRegionBackendServicesPagedResponse> future = regionBackendServiceClient.listRegionBackendServicesPagedCallable().futureCall(request);
     // Do something
     for (BackendService element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionBackendServicesHttpRequest,com.google.cloud.compute.v1.RegionBackendServiceClient$ListRegionBackendServicesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionBackendServiceClient this]
    (-> this (.listRegionBackendServicesPagedCallable))))

(defn shutdown
  ""
  ([^RegionBackendServiceClient this]
    (-> this (.shutdown))))

(defn update-region-backend-service
  "Updates the specified regional BackendService resource with the data included in the request.
   There are several restrictions and guidelines to keep in mind when updating a backend service.
   Read Restrictions and Guidelines for more information.

   Sample code:



   try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
     ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of(\"[PROJECT]\", \"[REGION]\", \"[BACKEND_SERVICE]\");
     BackendService backendServiceResource = BackendService.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = regionBackendServiceClient.updateRegionBackendService(backendService, backendServiceResource, fieldMask);
   }

  backend-service - Name of the BackendService resource to update. - `com.google.cloud.compute.v1.ProjectRegionBackendServiceName`
  backend-service-resource - A BackendService resource. This resource defines a group of backend virtual machines and their serving capacity. (== resource_for v1.backendService ==) (== resource_for beta.backendService ==) - `com.google.cloud.compute.v1.BackendService`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionBackendServiceClient this ^com.google.cloud.compute.v1.ProjectRegionBackendServiceName backend-service ^com.google.cloud.compute.v1.BackendService backend-service-resource ^java.util.List field-mask]
    (-> this (.updateRegionBackendService backend-service backend-service-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^RegionBackendServiceClient this ^com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest request]
    (-> this (.updateRegionBackendService request))))

(defn insert-region-backend-service
  "Creates a regional BackendService resource in the specified project using the data included in
   the request. There are several restrictions and guidelines to keep in mind when creating a
   regional backend service. Read Restrictions and Guidelines for more information.

   Sample code:



   try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     BackendService backendServiceResource = BackendService.newBuilder().build();
     Operation response = regionBackendServiceClient.insertRegionBackendService(region, backendServiceResource);
   }

  region - Name of the region scoping this request. - `com.google.cloud.compute.v1.ProjectRegionName`
  backend-service-resource - A BackendService resource. This resource defines a group of backend virtual machines and their serving capacity. (== resource_for v1.backendService ==) (== resource_for beta.backendService ==) - `com.google.cloud.compute.v1.BackendService`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionBackendServiceClient this ^com.google.cloud.compute.v1.ProjectRegionName region ^com.google.cloud.compute.v1.BackendService backend-service-resource]
    (-> this (.insertRegionBackendService region backend-service-resource)))
  (^com.google.cloud.compute.v1.Operation [^RegionBackendServiceClient this ^com.google.cloud.compute.v1.InsertRegionBackendServiceHttpRequest request]
    (-> this (.insertRegionBackendService request))))

(defn close
  ""
  ([^RegionBackendServiceClient this]
    (-> this (.close))))

(defn delete-region-backend-service
  "Deletes the specified regional BackendService resource.

   Sample code:



   try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
     ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of(\"[PROJECT]\", \"[REGION]\", \"[BACKEND_SERVICE]\");
     Operation response = regionBackendServiceClient.deleteRegionBackendService(backendService);
   }

  backend-service - Name of the BackendService resource to delete. - `com.google.cloud.compute.v1.ProjectRegionBackendServiceName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionBackendServiceClient this ^com.google.cloud.compute.v1.ProjectRegionBackendServiceName backend-service]
    (-> this (.deleteRegionBackendService backend-service))))

(defn update-region-backend-service-callable
  "Updates the specified regional BackendService resource with the data included in the request.
   There are several restrictions and guidelines to keep in mind when updating a backend service.
   Read Restrictions and Guidelines for more information.

   Sample code:



   try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
     String formattedBackendService = ProjectRegionBackendServiceName.format(\"[PROJECT]\", \"[REGION]\", \"[BACKEND_SERVICE]\");
     BackendService backendServiceResource = BackendService.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     UpdateRegionBackendServiceHttpRequest request = UpdateRegionBackendServiceHttpRequest.newBuilder()
       .setBackendService(formattedBackendService)
       .setBackendServiceResource(backendServiceResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = regionBackendServiceClient.updateRegionBackendServiceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionBackendServiceClient this]
    (-> this (.updateRegionBackendServiceCallable))))

(defn insert-region-backend-service-callable
  "Creates a regional BackendService resource in the specified project using the data included in
   the request. There are several restrictions and guidelines to keep in mind when creating a
   regional backend service. Read Restrictions and Guidelines for more information.

   Sample code:



   try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     BackendService backendServiceResource = BackendService.newBuilder().build();
     InsertRegionBackendServiceHttpRequest request = InsertRegionBackendServiceHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .setBackendServiceResource(backendServiceResource)
       .build();
     ApiFuture<Operation> future = regionBackendServiceClient.insertRegionBackendServiceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionBackendServiceClient this]
    (-> this (.insertRegionBackendServiceCallable))))

(defn get-region-backend-service-callable
  "Returns the specified regional BackendService resource.

   Sample code:



   try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
     String formattedBackendService = ProjectRegionBackendServiceName.format(\"[PROJECT]\", \"[REGION]\", \"[BACKEND_SERVICE]\");
     GetRegionBackendServiceHttpRequest request = GetRegionBackendServiceHttpRequest.newBuilder()
       .setBackendService(formattedBackendService)
       .build();
     ApiFuture<BackendService> future = regionBackendServiceClient.getRegionBackendServiceCallable().futureCall(request);
     // Do something
     BackendService response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendService>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionBackendServiceClient this]
    (-> this (.getRegionBackendServiceCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^RegionBackendServiceClient this]
    (-> this (.isTerminated))))

(defn get-region-backend-service
  "Returns the specified regional BackendService resource.

   Sample code:



   try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
     ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of(\"[PROJECT]\", \"[REGION]\", \"[BACKEND_SERVICE]\");
     BackendService response = regionBackendServiceClient.getRegionBackendService(backendService);
   }

  backend-service - Name of the BackendService resource to return. - `com.google.cloud.compute.v1.ProjectRegionBackendServiceName`

  returns: `com.google.cloud.compute.v1.BackendService`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.BackendService [^RegionBackendServiceClient this ^com.google.cloud.compute.v1.ProjectRegionBackendServiceName backend-service]
    (-> this (.getRegionBackendService backend-service))))

(defn patch-region-backend-service
  "Updates the specified regional BackendService resource with the data included in the request.
   There are several restrictions and guidelines to keep in mind when updating a backend service.
   Read Restrictions and Guidelines for more information. This method supports PATCH semantics and
   uses the JSON merge patch format and processing rules.

   Sample code:



   try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
     ProjectRegionBackendServiceName backendService = ProjectRegionBackendServiceName.of(\"[PROJECT]\", \"[REGION]\", \"[BACKEND_SERVICE]\");
     BackendService backendServiceResource = BackendService.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = regionBackendServiceClient.patchRegionBackendService(backendService, backendServiceResource, fieldMask);
   }

  backend-service - Name of the BackendService resource to patch. - `com.google.cloud.compute.v1.ProjectRegionBackendServiceName`
  backend-service-resource - A BackendService resource. This resource defines a group of backend virtual machines and their serving capacity. (== resource_for v1.backendService ==) (== resource_for beta.backendService ==) - `com.google.cloud.compute.v1.BackendService`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionBackendServiceClient this ^com.google.cloud.compute.v1.ProjectRegionBackendServiceName backend-service ^com.google.cloud.compute.v1.BackendService backend-service-resource ^java.util.List field-mask]
    (-> this (.patchRegionBackendService backend-service backend-service-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^RegionBackendServiceClient this ^com.google.cloud.compute.v1.PatchRegionBackendServiceHttpRequest request]
    (-> this (.patchRegionBackendService request))))

(defn list-region-backend-services
  "Retrieves the list of regional BackendService resources available to the specified project in
   the given region.

   Sample code:



   try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     for (BackendService element : regionBackendServiceClient.listRegionBackendServices(region).iterateAll()) {
       // doThingsWith(element);
     }
   }

  region - Name of the region scoping this request. - `com.google.cloud.compute.v1.ProjectRegionName`

  returns: `com.google.cloud.compute.v1.RegionBackendServiceClient$ListRegionBackendServicesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.RegionBackendServiceClient$ListRegionBackendServicesPagedResponse [^RegionBackendServiceClient this ^com.google.cloud.compute.v1.ProjectRegionName region]
    (-> this (.listRegionBackendServices region))))

(defn delete-region-backend-service-callable
  "Deletes the specified regional BackendService resource.

   Sample code:



   try (RegionBackendServiceClient regionBackendServiceClient = RegionBackendServiceClient.create()) {
     String formattedBackendService = ProjectRegionBackendServiceName.format(\"[PROJECT]\", \"[REGION]\", \"[BACKEND_SERVICE]\");
     DeleteRegionBackendServiceHttpRequest request = DeleteRegionBackendServiceHttpRequest.newBuilder()
       .setBackendService(formattedBackendService)
       .build();
     ApiFuture<Operation> future = regionBackendServiceClient.deleteRegionBackendServiceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionBackendServiceClient this]
    (-> this (.deleteRegionBackendServiceCallable))))

(defn shutdown-now
  ""
  ([^RegionBackendServiceClient this]
    (-> this (.shutdownNow))))

