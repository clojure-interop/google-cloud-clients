(ns com.google.cloud.compute.v1.UrlMapClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (UrlMapClient urlMapClient = UrlMapClient.create()) {
    ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of(\"[PROJECT]\", \"[URL_MAP]\");
    Operation response = urlMapClient.deleteUrlMap(urlMap);
  }

  Note: close() needs to be called on the urlMapClient object to clean up resources such as
  threads. In the example above, try-with-resources is used, which automatically calls close().

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

  This class can be customized by passing in a custom instance of UrlMapSettings to create().
  For example:

  To customize credentials:



  UrlMapSettings urlMapSettings =
      UrlMapSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  UrlMapClient urlMapClient =
      UrlMapClient.create(urlMapSettings);

  To customize the endpoint:



  UrlMapSettings urlMapSettings =
      UrlMapSettings.newBuilder().setEndpoint(myEndpoint).build();
  UrlMapClient urlMapClient =
      UrlMapClient.create(urlMapSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UrlMapClient]))

(defn *create
  "Constructs an instance of UrlMapClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.UrlMapSettings`

  returns: `com.google.cloud.compute.v1.UrlMapClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.UrlMapClient [^com.google.cloud.compute.v1.UrlMapSettings settings]
    (UrlMapClient/create settings))
  (^com.google.cloud.compute.v1.UrlMapClient []
    (UrlMapClient/create )))

(defn delete-url-map-callable
  "Deletes the specified UrlMap resource.

   Sample code:



   try (UrlMapClient urlMapClient = UrlMapClient.create()) {
     String formattedUrlMap = ProjectGlobalUrlMapName.format(\"[PROJECT]\", \"[URL_MAP]\");
     DeleteUrlMapHttpRequest request = DeleteUrlMapHttpRequest.newBuilder()
       .setUrlMap(formattedUrlMap)
       .build();
     ApiFuture<Operation> future = urlMapClient.deleteUrlMapCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UrlMapClient this]
    (-> this (.deleteUrlMapCallable))))

(defn get-url-map-callable
  "Returns the specified UrlMap resource. Gets a list of available URL maps by making a list()
   request.

   Sample code:



   try (UrlMapClient urlMapClient = UrlMapClient.create()) {
     String formattedUrlMap = ProjectGlobalUrlMapName.format(\"[PROJECT]\", \"[URL_MAP]\");
     GetUrlMapHttpRequest request = GetUrlMapHttpRequest.newBuilder()
       .setUrlMap(formattedUrlMap)
       .build();
     ApiFuture<UrlMap> future = urlMapClient.getUrlMapCallable().futureCall(request);
     // Do something
     UrlMap response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetUrlMapHttpRequest,com.google.cloud.compute.v1.UrlMap>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UrlMapClient this]
    (-> this (.getUrlMapCallable))))

(defn patch-url-map-callable
  "Patches the specified UrlMap resource with the data included in the request. This method
   supports PATCH semantics and uses the JSON merge patch format and processing rules.

   Sample code:



   try (UrlMapClient urlMapClient = UrlMapClient.create()) {
     String formattedUrlMap = ProjectGlobalUrlMapName.format(\"[PROJECT]\", \"[URL_MAP]\");
     UrlMap urlMapResource = UrlMap.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     PatchUrlMapHttpRequest request = PatchUrlMapHttpRequest.newBuilder()
       .setUrlMap(formattedUrlMap)
       .setUrlMapResource(urlMapResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = urlMapClient.patchUrlMapCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UrlMapClient this]
    (-> this (.patchUrlMapCallable))))

(defn insert-url-map-callable
  "Creates a UrlMap resource in the specified project using the data included in the request.

   Sample code:



   try (UrlMapClient urlMapClient = UrlMapClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     UrlMap urlMapResource = UrlMap.newBuilder().build();
     InsertUrlMapHttpRequest request = InsertUrlMapHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setUrlMapResource(urlMapResource)
       .build();
     ApiFuture<Operation> future = urlMapClient.insertUrlMapCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UrlMapClient this]
    (-> this (.insertUrlMapCallable))))

(defn validate-url-map
  "Runs static validation for the UrlMap. In particular, the tests of the provided UrlMap will be
   run. Calling this method does NOT create the UrlMap.

   Sample code:



   try (UrlMapClient urlMapClient = UrlMapClient.create()) {
     ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of(\"[PROJECT]\", \"[URL_MAP]\");
     UrlMapsValidateRequest urlMapsValidateRequestResource = UrlMapsValidateRequest.newBuilder().build();
     UrlMapsValidateResponse response = urlMapClient.validateUrlMap(urlMap, urlMapsValidateRequestResource);
   }

  url-map - Name of the UrlMap resource to be validated as. - `com.google.cloud.compute.v1.ProjectGlobalUrlMapName`
  url-maps-validate-request-resource - `com.google.cloud.compute.v1.UrlMapsValidateRequest`

  returns: `com.google.cloud.compute.v1.UrlMapsValidateResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.UrlMapsValidateResponse [^UrlMapClient this ^com.google.cloud.compute.v1.ProjectGlobalUrlMapName url-map ^com.google.cloud.compute.v1.UrlMapsValidateRequest url-maps-validate-request-resource]
    (-> this (.validateUrlMap url-map url-maps-validate-request-resource)))
  (^com.google.cloud.compute.v1.UrlMapsValidateResponse [^UrlMapClient this ^com.google.cloud.compute.v1.ValidateUrlMapHttpRequest request]
    (-> this (.validateUrlMap request))))

(defn invalidate-cache-url-map-callable
  "Initiates a cache invalidation operation, invalidating the specified path, scoped to the
   specified UrlMap.

   Sample code:



   try (UrlMapClient urlMapClient = UrlMapClient.create()) {
     String formattedUrlMap = ProjectGlobalUrlMapName.format(\"[PROJECT]\", \"[URL_MAP]\");
     CacheInvalidationRule cacheInvalidationRuleResource = CacheInvalidationRule.newBuilder().build();
     InvalidateCacheUrlMapHttpRequest request = InvalidateCacheUrlMapHttpRequest.newBuilder()
       .setUrlMap(formattedUrlMap)
       .setCacheInvalidationRuleResource(cacheInvalidationRuleResource)
       .build();
     ApiFuture<Operation> future = urlMapClient.invalidateCacheUrlMapCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InvalidateCacheUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UrlMapClient this]
    (-> this (.invalidateCacheUrlMapCallable))))

(defn list-url-maps
  "Retrieves the list of UrlMap resources available to the specified project.

   Sample code:



   try (UrlMapClient urlMapClient = UrlMapClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (UrlMap element : urlMapClient.listUrlMaps(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.UrlMapClient$ListUrlMapsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.UrlMapClient$ListUrlMapsPagedResponse [^UrlMapClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listUrlMaps project))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.UrlMapSettings`"
  (^com.google.cloud.compute.v1.UrlMapSettings [^UrlMapClient this]
    (-> this (.getSettings))))

(defn validate-url-map-callable
  "Runs static validation for the UrlMap. In particular, the tests of the provided UrlMap will be
   run. Calling this method does NOT create the UrlMap.

   Sample code:



   try (UrlMapClient urlMapClient = UrlMapClient.create()) {
     String formattedUrlMap = ProjectGlobalUrlMapName.format(\"[PROJECT]\", \"[URL_MAP]\");
     UrlMapsValidateRequest urlMapsValidateRequestResource = UrlMapsValidateRequest.newBuilder().build();
     ValidateUrlMapHttpRequest request = ValidateUrlMapHttpRequest.newBuilder()
       .setUrlMap(formattedUrlMap)
       .setUrlMapsValidateRequestResource(urlMapsValidateRequestResource)
       .build();
     ApiFuture<UrlMapsValidateResponse> future = urlMapClient.validateUrlMapCallable().futureCall(request);
     // Do something
     UrlMapsValidateResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ValidateUrlMapHttpRequest,com.google.cloud.compute.v1.UrlMapsValidateResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UrlMapClient this]
    (-> this (.validateUrlMapCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.UrlMapStub`"
  ([^UrlMapClient this]
    (-> this (.getStub))))

(defn invalidate-cache-url-map
  "Initiates a cache invalidation operation, invalidating the specified path, scoped to the
   specified UrlMap.

   Sample code:



   try (UrlMapClient urlMapClient = UrlMapClient.create()) {
     ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of(\"[PROJECT]\", \"[URL_MAP]\");
     CacheInvalidationRule cacheInvalidationRuleResource = CacheInvalidationRule.newBuilder().build();
     Operation response = urlMapClient.invalidateCacheUrlMap(urlMap, cacheInvalidationRuleResource);
   }

  url-map - Name of the UrlMap scoping this request. - `com.google.cloud.compute.v1.ProjectGlobalUrlMapName`
  cache-invalidation-rule-resource - `com.google.cloud.compute.v1.CacheInvalidationRule`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^UrlMapClient this ^com.google.cloud.compute.v1.ProjectGlobalUrlMapName url-map ^com.google.cloud.compute.v1.CacheInvalidationRule cache-invalidation-rule-resource]
    (-> this (.invalidateCacheUrlMap url-map cache-invalidation-rule-resource)))
  (^com.google.cloud.compute.v1.Operation [^UrlMapClient this ^com.google.cloud.compute.v1.InvalidateCacheUrlMapHttpRequest request]
    (-> this (.invalidateCacheUrlMap request))))

(defn list-url-maps-callable
  "Retrieves the list of UrlMap resources available to the specified project.

   Sample code:



   try (UrlMapClient urlMapClient = UrlMapClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListUrlMapsHttpRequest request = ListUrlMapsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       UrlMapList response = urlMapClient.listUrlMapsCallable().call(request);
       for (UrlMap element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListUrlMapsHttpRequest,com.google.cloud.compute.v1.UrlMapList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UrlMapClient this]
    (-> this (.listUrlMapsCallable))))

(defn patch-url-map
  "Patches the specified UrlMap resource with the data included in the request. This method
   supports PATCH semantics and uses the JSON merge patch format and processing rules.

   Sample code:



   try (UrlMapClient urlMapClient = UrlMapClient.create()) {
     ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of(\"[PROJECT]\", \"[URL_MAP]\");
     UrlMap urlMapResource = UrlMap.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = urlMapClient.patchUrlMap(urlMap, urlMapResource, fieldMask);
   }

  url-map - Name of the UrlMap resource to patch. - `com.google.cloud.compute.v1.ProjectGlobalUrlMapName`
  url-map-resource - A UrlMap resource. This resource defines the mapping from URL to the BackendService resource, based on the \"longest-match\" of the URL's host and path. - `com.google.cloud.compute.v1.UrlMap`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^UrlMapClient this ^com.google.cloud.compute.v1.ProjectGlobalUrlMapName url-map ^com.google.cloud.compute.v1.UrlMap url-map-resource ^java.util.List field-mask]
    (-> this (.patchUrlMap url-map url-map-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^UrlMapClient this ^com.google.cloud.compute.v1.PatchUrlMapHttpRequest request]
    (-> this (.patchUrlMap request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^UrlMapClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^UrlMapClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn delete-url-map
  "Deletes the specified UrlMap resource.

   Sample code:



   try (UrlMapClient urlMapClient = UrlMapClient.create()) {
     ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of(\"[PROJECT]\", \"[URL_MAP]\");
     Operation response = urlMapClient.deleteUrlMap(urlMap);
   }

  url-map - Name of the UrlMap resource to delete. - `com.google.cloud.compute.v1.ProjectGlobalUrlMapName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^UrlMapClient this ^com.google.cloud.compute.v1.ProjectGlobalUrlMapName url-map]
    (-> this (.deleteUrlMap url-map))))

(defn shutdown
  ""
  ([^UrlMapClient this]
    (-> this (.shutdown))))

(defn get-url-map
  "Returns the specified UrlMap resource. Gets a list of available URL maps by making a list()
   request.

   Sample code:



   try (UrlMapClient urlMapClient = UrlMapClient.create()) {
     ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of(\"[PROJECT]\", \"[URL_MAP]\");
     UrlMap response = urlMapClient.getUrlMap(urlMap);
   }

  url-map - Name of the UrlMap resource to return. - `com.google.cloud.compute.v1.ProjectGlobalUrlMapName`

  returns: `com.google.cloud.compute.v1.UrlMap`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.UrlMap [^UrlMapClient this ^com.google.cloud.compute.v1.ProjectGlobalUrlMapName url-map]
    (-> this (.getUrlMap url-map))))

(defn update-url-map-callable
  "Updates the specified UrlMap resource with the data included in the request.

   Sample code:



   try (UrlMapClient urlMapClient = UrlMapClient.create()) {
     String formattedUrlMap = ProjectGlobalUrlMapName.format(\"[PROJECT]\", \"[URL_MAP]\");
     UrlMap urlMapResource = UrlMap.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     UpdateUrlMapHttpRequest request = UpdateUrlMapHttpRequest.newBuilder()
       .setUrlMap(formattedUrlMap)
       .setUrlMapResource(urlMapResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = urlMapClient.updateUrlMapCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateUrlMapHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UrlMapClient this]
    (-> this (.updateUrlMapCallable))))

(defn update-url-map
  "Updates the specified UrlMap resource with the data included in the request.

   Sample code:



   try (UrlMapClient urlMapClient = UrlMapClient.create()) {
     ProjectGlobalUrlMapName urlMap = ProjectGlobalUrlMapName.of(\"[PROJECT]\", \"[URL_MAP]\");
     UrlMap urlMapResource = UrlMap.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = urlMapClient.updateUrlMap(urlMap, urlMapResource, fieldMask);
   }

  url-map - Name of the UrlMap resource to update. - `com.google.cloud.compute.v1.ProjectGlobalUrlMapName`
  url-map-resource - A UrlMap resource. This resource defines the mapping from URL to the BackendService resource, based on the \"longest-match\" of the URL's host and path. - `com.google.cloud.compute.v1.UrlMap`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^UrlMapClient this ^com.google.cloud.compute.v1.ProjectGlobalUrlMapName url-map ^com.google.cloud.compute.v1.UrlMap url-map-resource ^java.util.List field-mask]
    (-> this (.updateUrlMap url-map url-map-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^UrlMapClient this ^com.google.cloud.compute.v1.UpdateUrlMapHttpRequest request]
    (-> this (.updateUrlMap request))))

(defn close
  ""
  ([^UrlMapClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^UrlMapClient this]
    (-> this (.isTerminated))))

(defn list-url-maps-paged-callable
  "Retrieves the list of UrlMap resources available to the specified project.

   Sample code:



   try (UrlMapClient urlMapClient = UrlMapClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListUrlMapsHttpRequest request = ListUrlMapsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListUrlMapsPagedResponse> future = urlMapClient.listUrlMapsPagedCallable().futureCall(request);
     // Do something
     for (UrlMap element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListUrlMapsHttpRequest,com.google.cloud.compute.v1.UrlMapClient$ListUrlMapsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UrlMapClient this]
    (-> this (.listUrlMapsPagedCallable))))

(defn insert-url-map
  "Creates a UrlMap resource in the specified project using the data included in the request.

   Sample code:



   try (UrlMapClient urlMapClient = UrlMapClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     UrlMap urlMapResource = UrlMap.newBuilder().build();
     Operation response = urlMapClient.insertUrlMap(project, urlMapResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  url-map-resource - A UrlMap resource. This resource defines the mapping from URL to the BackendService resource, based on the \"longest-match\" of the URL's host and path. - `com.google.cloud.compute.v1.UrlMap`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^UrlMapClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.UrlMap url-map-resource]
    (-> this (.insertUrlMap project url-map-resource)))
  (^com.google.cloud.compute.v1.Operation [^UrlMapClient this ^com.google.cloud.compute.v1.InsertUrlMapHttpRequest request]
    (-> this (.insertUrlMap request))))

(defn shutdown-now
  ""
  ([^UrlMapClient this]
    (-> this (.shutdownNow))))

