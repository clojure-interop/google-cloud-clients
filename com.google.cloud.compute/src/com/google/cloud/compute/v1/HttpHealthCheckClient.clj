(ns com.google.cloud.compute.v1.HttpHealthCheckClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
    ProjectGlobalHttpHealthCheckName httpHealthCheck = ProjectGlobalHttpHealthCheckName.of(\"[PROJECT]\", \"[HTTP_HEALTH_CHECK]\");
    Operation response = httpHealthCheckClient.deleteHttpHealthCheck(httpHealthCheck);
  }

  Note: close() needs to be called on the httpHealthCheckClient object to clean up resources
  such as threads. In the example above, try-with-resources is used, which automatically calls
  close().

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

  This class can be customized by passing in a custom instance of HttpHealthCheckSettings to
  create(). For example:

  To customize credentials:



  HttpHealthCheckSettings httpHealthCheckSettings =
      HttpHealthCheckSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  HttpHealthCheckClient httpHealthCheckClient =
      HttpHealthCheckClient.create(httpHealthCheckSettings);

  To customize the endpoint:



  HttpHealthCheckSettings httpHealthCheckSettings =
      HttpHealthCheckSettings.newBuilder().setEndpoint(myEndpoint).build();
  HttpHealthCheckClient httpHealthCheckClient =
      HttpHealthCheckClient.create(httpHealthCheckSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HttpHealthCheckClient]))

(defn *create
  "Constructs an instance of HttpHealthCheckClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.HttpHealthCheckSettings`

  returns: `com.google.cloud.compute.v1.HttpHealthCheckClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.HttpHealthCheckClient [^com.google.cloud.compute.v1.HttpHealthCheckSettings settings]
    (HttpHealthCheckClient/create settings))
  (^com.google.cloud.compute.v1.HttpHealthCheckClient []
    (HttpHealthCheckClient/create )))

(defn delete-http-health-check
  "Deletes the specified HttpHealthCheck resource.

   Sample code:



   try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
     ProjectGlobalHttpHealthCheckName httpHealthCheck = ProjectGlobalHttpHealthCheckName.of(\"[PROJECT]\", \"[HTTP_HEALTH_CHECK]\");
     Operation response = httpHealthCheckClient.deleteHttpHealthCheck(httpHealthCheck);
   }

  http-health-check - Name of the HttpHealthCheck resource to delete. - `com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^HttpHealthCheckClient this ^com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName http-health-check]
    (-> this (.deleteHttpHealthCheck http-health-check))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.HttpHealthCheckSettings`"
  (^com.google.cloud.compute.v1.HttpHealthCheckSettings [^HttpHealthCheckClient this]
    (-> this (.getSettings))))

(defn list-http-health-checks-callable
  "Retrieves the list of HttpHealthCheck resources available to the specified project.

   Sample code:



   try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListHttpHealthChecksHttpRequest request = ListHttpHealthChecksHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       HttpHealthCheckList response = httpHealthCheckClient.listHttpHealthChecksCallable().call(request);
       for (HttpHealthCheck2 element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListHttpHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpHealthCheckList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpHealthCheckClient this]
    (-> this (.listHttpHealthChecksCallable))))

(defn patch-http-health-check-callable
  "Updates a HttpHealthCheck resource in the specified project using the data included in the
   request. This method supports PATCH semantics and uses the JSON merge patch format and
   processing rules.

   Sample code:



   try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
     String formattedHttpHealthCheck = ProjectGlobalHttpHealthCheckName.format(\"[PROJECT]\", \"[HTTP_HEALTH_CHECK]\");
     HttpHealthCheck2 httpHealthCheckResource = HttpHealthCheck2.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     PatchHttpHealthCheckHttpRequest request = PatchHttpHealthCheckHttpRequest.newBuilder()
       .setHttpHealthCheck(formattedHttpHealthCheck)
       .setHttpHealthCheckResource(httpHealthCheckResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = httpHealthCheckClient.patchHttpHealthCheckCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpHealthCheckClient this]
    (-> this (.patchHttpHealthCheckCallable))))

(defn delete-http-health-check-callable
  "Deletes the specified HttpHealthCheck resource.

   Sample code:



   try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
     String formattedHttpHealthCheck = ProjectGlobalHttpHealthCheckName.format(\"[PROJECT]\", \"[HTTP_HEALTH_CHECK]\");
     DeleteHttpHealthCheckHttpRequest request = DeleteHttpHealthCheckHttpRequest.newBuilder()
       .setHttpHealthCheck(formattedHttpHealthCheck)
       .build();
     ApiFuture<Operation> future = httpHealthCheckClient.deleteHttpHealthCheckCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpHealthCheckClient this]
    (-> this (.deleteHttpHealthCheckCallable))))

(defn get-http-health-check-callable
  "Returns the specified HttpHealthCheck resource. Gets a list of available HTTP health checks by
   making a list() request.

   Sample code:



   try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
     String formattedHttpHealthCheck = ProjectGlobalHttpHealthCheckName.format(\"[PROJECT]\", \"[HTTP_HEALTH_CHECK]\");
     GetHttpHealthCheckHttpRequest request = GetHttpHealthCheckHttpRequest.newBuilder()
       .setHttpHealthCheck(formattedHttpHealthCheck)
       .build();
     ApiFuture<HttpHealthCheck2> future = httpHealthCheckClient.getHttpHealthCheckCallable().futureCall(request);
     // Do something
     HttpHealthCheck2 response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.HttpHealthCheck2>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpHealthCheckClient this]
    (-> this (.getHttpHealthCheckCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.HttpHealthCheckStub`"
  ([^HttpHealthCheckClient this]
    (-> this (.getStub))))

(defn insert-http-health-check-callable
  "Creates a HttpHealthCheck resource in the specified project using the data included in the
   request.

   Sample code:



   try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     HttpHealthCheck2 httpHealthCheckResource = HttpHealthCheck2.newBuilder().build();
     InsertHttpHealthCheckHttpRequest request = InsertHttpHealthCheckHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setHttpHealthCheckResource(httpHealthCheckResource)
       .build();
     ApiFuture<Operation> future = httpHealthCheckClient.insertHttpHealthCheckCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpHealthCheckClient this]
    (-> this (.insertHttpHealthCheckCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpHealthCheckClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpHealthCheckClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpHealthCheckClient this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^HttpHealthCheckClient this]
    (-> this (.close))))

(defn insert-http-health-check
  "Creates a HttpHealthCheck resource in the specified project using the data included in the
   request.

   Sample code:



   try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     HttpHealthCheck2 httpHealthCheckResource = HttpHealthCheck2.newBuilder().build();
     Operation response = httpHealthCheckClient.insertHttpHealthCheck(project, httpHealthCheckResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  http-health-check-resource - An HttpHealthCheck resource. This resource defines a template for how individual instances should be checked for health, via HTTP. - `com.google.cloud.compute.v1.HttpHealthCheck2`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^HttpHealthCheckClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.HttpHealthCheck2 http-health-check-resource]
    (-> this (.insertHttpHealthCheck project http-health-check-resource)))
  (^com.google.cloud.compute.v1.Operation [^HttpHealthCheckClient this ^com.google.cloud.compute.v1.InsertHttpHealthCheckHttpRequest request]
    (-> this (.insertHttpHealthCheck request))))

(defn list-http-health-checks
  "Retrieves the list of HttpHealthCheck resources available to the specified project.

   Sample code:



   try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (HttpHealthCheck2 element : httpHealthCheckClient.listHttpHealthChecks(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.HttpHealthCheckClient$ListHttpHealthChecksPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.HttpHealthCheckClient$ListHttpHealthChecksPagedResponse [^HttpHealthCheckClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listHttpHealthChecks project))))

(defn patch-http-health-check
  "Updates a HttpHealthCheck resource in the specified project using the data included in the
   request. This method supports PATCH semantics and uses the JSON merge patch format and
   processing rules.

   Sample code:



   try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
     ProjectGlobalHttpHealthCheckName httpHealthCheck = ProjectGlobalHttpHealthCheckName.of(\"[PROJECT]\", \"[HTTP_HEALTH_CHECK]\");
     HttpHealthCheck2 httpHealthCheckResource = HttpHealthCheck2.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = httpHealthCheckClient.patchHttpHealthCheck(httpHealthCheck, httpHealthCheckResource, fieldMask);
   }

  http-health-check - Name of the HttpHealthCheck resource to patch. - `com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName`
  http-health-check-resource - An HttpHealthCheck resource. This resource defines a template for how individual instances should be checked for health, via HTTP. - `com.google.cloud.compute.v1.HttpHealthCheck2`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^HttpHealthCheckClient this ^com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName http-health-check ^com.google.cloud.compute.v1.HttpHealthCheck2 http-health-check-resource ^java.util.List field-mask]
    (-> this (.patchHttpHealthCheck http-health-check http-health-check-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^HttpHealthCheckClient this ^com.google.cloud.compute.v1.PatchHttpHealthCheckHttpRequest request]
    (-> this (.patchHttpHealthCheck request))))

(defn update-http-health-check
  "Updates a HttpHealthCheck resource in the specified project using the data included in the
   request.

   Sample code:



   try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
     ProjectGlobalHttpHealthCheckName httpHealthCheck = ProjectGlobalHttpHealthCheckName.of(\"[PROJECT]\", \"[HTTP_HEALTH_CHECK]\");
     HttpHealthCheck2 httpHealthCheckResource = HttpHealthCheck2.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = httpHealthCheckClient.updateHttpHealthCheck(httpHealthCheck, httpHealthCheckResource, fieldMask);
   }

  http-health-check - Name of the HttpHealthCheck resource to update. - `com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName`
  http-health-check-resource - An HttpHealthCheck resource. This resource defines a template for how individual instances should be checked for health, via HTTP. - `com.google.cloud.compute.v1.HttpHealthCheck2`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^HttpHealthCheckClient this ^com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName http-health-check ^com.google.cloud.compute.v1.HttpHealthCheck2 http-health-check-resource ^java.util.List field-mask]
    (-> this (.updateHttpHealthCheck http-health-check http-health-check-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^HttpHealthCheckClient this ^com.google.cloud.compute.v1.UpdateHttpHealthCheckHttpRequest request]
    (-> this (.updateHttpHealthCheck request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpHealthCheckClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^HttpHealthCheckClient this]
    (-> this (.shutdownNow))))

(defn get-http-health-check
  "Returns the specified HttpHealthCheck resource. Gets a list of available HTTP health checks by
   making a list() request.

   Sample code:



   try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
     ProjectGlobalHttpHealthCheckName httpHealthCheck = ProjectGlobalHttpHealthCheckName.of(\"[PROJECT]\", \"[HTTP_HEALTH_CHECK]\");
     HttpHealthCheck2 response = httpHealthCheckClient.getHttpHealthCheck(httpHealthCheck);
   }

  http-health-check - Name of the HttpHealthCheck resource to return. - `com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName`

  returns: `com.google.cloud.compute.v1.HttpHealthCheck2`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.HttpHealthCheck2 [^HttpHealthCheckClient this ^com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName http-health-check]
    (-> this (.getHttpHealthCheck http-health-check))))

(defn update-http-health-check-callable
  "Updates a HttpHealthCheck resource in the specified project using the data included in the
   request.

   Sample code:



   try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
     String formattedHttpHealthCheck = ProjectGlobalHttpHealthCheckName.format(\"[PROJECT]\", \"[HTTP_HEALTH_CHECK]\");
     HttpHealthCheck2 httpHealthCheckResource = HttpHealthCheck2.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     UpdateHttpHealthCheckHttpRequest request = UpdateHttpHealthCheckHttpRequest.newBuilder()
       .setHttpHealthCheck(formattedHttpHealthCheck)
       .setHttpHealthCheckResource(httpHealthCheckResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = httpHealthCheckClient.updateHttpHealthCheckCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpHealthCheckClient this]
    (-> this (.updateHttpHealthCheckCallable))))

(defn list-http-health-checks-paged-callable
  "Retrieves the list of HttpHealthCheck resources available to the specified project.

   Sample code:



   try (HttpHealthCheckClient httpHealthCheckClient = HttpHealthCheckClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListHttpHealthChecksHttpRequest request = ListHttpHealthChecksHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListHttpHealthChecksPagedResponse> future = httpHealthCheckClient.listHttpHealthChecksPagedCallable().futureCall(request);
     // Do something
     for (HttpHealthCheck2 element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListHttpHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpHealthCheckClient$ListHttpHealthChecksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpHealthCheckClient this]
    (-> this (.listHttpHealthChecksPagedCallable))))

