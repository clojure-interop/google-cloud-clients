(ns com.google.cloud.compute.v1.HttpsHealthCheckClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (HttpsHealthCheckClient httpsHealthCheckClient = HttpsHealthCheckClient.create()) {
    ProjectGlobalHttpsHealthCheckName httpsHealthCheck = ProjectGlobalHttpsHealthCheckName.of(\"[PROJECT]\", \"[HTTPS_HEALTH_CHECK]\");
    Operation response = httpsHealthCheckClient.deleteHttpsHealthCheck(httpsHealthCheck);
  }

  Note: close() needs to be called on the httpsHealthCheckClient object to clean up resources
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

  This class can be customized by passing in a custom instance of HttpsHealthCheckSettings to
  create(). For example:

  To customize credentials:



  HttpsHealthCheckSettings httpsHealthCheckSettings =
      HttpsHealthCheckSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  HttpsHealthCheckClient httpsHealthCheckClient =
      HttpsHealthCheckClient.create(httpsHealthCheckSettings);

  To customize the endpoint:



  HttpsHealthCheckSettings httpsHealthCheckSettings =
      HttpsHealthCheckSettings.newBuilder().setEndpoint(myEndpoint).build();
  HttpsHealthCheckClient httpsHealthCheckClient =
      HttpsHealthCheckClient.create(httpsHealthCheckSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HttpsHealthCheckClient]))

(defn *create
  "Constructs an instance of HttpsHealthCheckClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.HttpsHealthCheckSettings`

  returns: `com.google.cloud.compute.v1.HttpsHealthCheckClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.HttpsHealthCheckClient [^com.google.cloud.compute.v1.HttpsHealthCheckSettings settings]
    (HttpsHealthCheckClient/create settings))
  (^com.google.cloud.compute.v1.HttpsHealthCheckClient []
    (HttpsHealthCheckClient/create )))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.HttpsHealthCheckSettings`"
  (^com.google.cloud.compute.v1.HttpsHealthCheckSettings [^HttpsHealthCheckClient this]
    (-> this (.getSettings))))

(defn patch-https-health-check-callable
  "Updates a HttpsHealthCheck resource in the specified project using the data included in the
   request. This method supports PATCH semantics and uses the JSON merge patch format and
   processing rules.

   Sample code:



   try (HttpsHealthCheckClient httpsHealthCheckClient = HttpsHealthCheckClient.create()) {
     String formattedHttpsHealthCheck = ProjectGlobalHttpsHealthCheckName.format(\"[PROJECT]\", \"[HTTPS_HEALTH_CHECK]\");
     HttpsHealthCheck2 httpsHealthCheckResource = HttpsHealthCheck2.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     PatchHttpsHealthCheckHttpRequest request = PatchHttpsHealthCheckHttpRequest.newBuilder()
       .setHttpsHealthCheck(formattedHttpsHealthCheck)
       .setHttpsHealthCheckResource(httpsHealthCheckResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = httpsHealthCheckClient.patchHttpsHealthCheckCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpsHealthCheckClient this]
    (-> this (.patchHttpsHealthCheckCallable))))

(defn get-https-health-check-callable
  "Returns the specified HttpsHealthCheck resource. Gets a list of available HTTPS health checks
   by making a list() request.

   Sample code:



   try (HttpsHealthCheckClient httpsHealthCheckClient = HttpsHealthCheckClient.create()) {
     String formattedHttpsHealthCheck = ProjectGlobalHttpsHealthCheckName.format(\"[PROJECT]\", \"[HTTPS_HEALTH_CHECK]\");
     GetHttpsHealthCheckHttpRequest request = GetHttpsHealthCheckHttpRequest.newBuilder()
       .setHttpsHealthCheck(formattedHttpsHealthCheck)
       .build();
     ApiFuture<HttpsHealthCheck2> future = httpsHealthCheckClient.getHttpsHealthCheckCallable().futureCall(request);
     // Do something
     HttpsHealthCheck2 response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.HttpsHealthCheck2>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpsHealthCheckClient this]
    (-> this (.getHttpsHealthCheckCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.HttpsHealthCheckStub`"
  ([^HttpsHealthCheckClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpsHealthCheckClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpsHealthCheckClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpsHealthCheckClient this]
    (-> this (.shutdown))))

(defn update-https-health-check
  "Updates a HttpsHealthCheck resource in the specified project using the data included in the
   request.

   Sample code:



   try (HttpsHealthCheckClient httpsHealthCheckClient = HttpsHealthCheckClient.create()) {
     ProjectGlobalHttpsHealthCheckName httpsHealthCheck = ProjectGlobalHttpsHealthCheckName.of(\"[PROJECT]\", \"[HTTPS_HEALTH_CHECK]\");
     HttpsHealthCheck2 httpsHealthCheckResource = HttpsHealthCheck2.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = httpsHealthCheckClient.updateHttpsHealthCheck(httpsHealthCheck, httpsHealthCheckResource, fieldMask);
   }

  https-health-check - Name of the HttpsHealthCheck resource to update. - `com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName`
  https-health-check-resource - An HttpsHealthCheck resource. This resource defines a template for how individual instances should be checked for health, via HTTPS. - `com.google.cloud.compute.v1.HttpsHealthCheck2`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^HttpsHealthCheckClient this ^com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName https-health-check ^com.google.cloud.compute.v1.HttpsHealthCheck2 https-health-check-resource ^java.util.List field-mask]
    (-> this (.updateHttpsHealthCheck https-health-check https-health-check-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^HttpsHealthCheckClient this ^com.google.cloud.compute.v1.UpdateHttpsHealthCheckHttpRequest request]
    (-> this (.updateHttpsHealthCheck request))))

(defn get-https-health-check
  "Returns the specified HttpsHealthCheck resource. Gets a list of available HTTPS health checks
   by making a list() request.

   Sample code:



   try (HttpsHealthCheckClient httpsHealthCheckClient = HttpsHealthCheckClient.create()) {
     ProjectGlobalHttpsHealthCheckName httpsHealthCheck = ProjectGlobalHttpsHealthCheckName.of(\"[PROJECT]\", \"[HTTPS_HEALTH_CHECK]\");
     HttpsHealthCheck2 response = httpsHealthCheckClient.getHttpsHealthCheck(httpsHealthCheck);
   }

  https-health-check - Name of the HttpsHealthCheck resource to return. - `com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName`

  returns: `com.google.cloud.compute.v1.HttpsHealthCheck2`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.HttpsHealthCheck2 [^HttpsHealthCheckClient this ^com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName https-health-check]
    (-> this (.getHttpsHealthCheck https-health-check))))

(defn list-https-health-checks
  "Retrieves the list of HttpsHealthCheck resources available to the specified project.

   Sample code:



   try (HttpsHealthCheckClient httpsHealthCheckClient = HttpsHealthCheckClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (HttpsHealthCheck2 element : httpsHealthCheckClient.listHttpsHealthChecks(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.HttpsHealthCheckClient$ListHttpsHealthChecksPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.HttpsHealthCheckClient$ListHttpsHealthChecksPagedResponse [^HttpsHealthCheckClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listHttpsHealthChecks project))))

(defn delete-https-health-check-callable
  "Deletes the specified HttpsHealthCheck resource.

   Sample code:



   try (HttpsHealthCheckClient httpsHealthCheckClient = HttpsHealthCheckClient.create()) {
     String formattedHttpsHealthCheck = ProjectGlobalHttpsHealthCheckName.format(\"[PROJECT]\", \"[HTTPS_HEALTH_CHECK]\");
     DeleteHttpsHealthCheckHttpRequest request = DeleteHttpsHealthCheckHttpRequest.newBuilder()
       .setHttpsHealthCheck(formattedHttpsHealthCheck)
       .build();
     ApiFuture<Operation> future = httpsHealthCheckClient.deleteHttpsHealthCheckCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpsHealthCheckClient this]
    (-> this (.deleteHttpsHealthCheckCallable))))

(defn list-https-health-checks-callable
  "Retrieves the list of HttpsHealthCheck resources available to the specified project.

   Sample code:



   try (HttpsHealthCheckClient httpsHealthCheckClient = HttpsHealthCheckClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListHttpsHealthChecksHttpRequest request = ListHttpsHealthChecksHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       HttpsHealthCheckList response = httpsHealthCheckClient.listHttpsHealthChecksCallable().call(request);
       for (HttpsHealthCheck2 element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListHttpsHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpsHealthCheckList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpsHealthCheckClient this]
    (-> this (.listHttpsHealthChecksCallable))))

(defn update-https-health-check-callable
  "Updates a HttpsHealthCheck resource in the specified project using the data included in the
   request.

   Sample code:



   try (HttpsHealthCheckClient httpsHealthCheckClient = HttpsHealthCheckClient.create()) {
     String formattedHttpsHealthCheck = ProjectGlobalHttpsHealthCheckName.format(\"[PROJECT]\", \"[HTTPS_HEALTH_CHECK]\");
     HttpsHealthCheck2 httpsHealthCheckResource = HttpsHealthCheck2.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     UpdateHttpsHealthCheckHttpRequest request = UpdateHttpsHealthCheckHttpRequest.newBuilder()
       .setHttpsHealthCheck(formattedHttpsHealthCheck)
       .setHttpsHealthCheckResource(httpsHealthCheckResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = httpsHealthCheckClient.updateHttpsHealthCheckCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpsHealthCheckClient this]
    (-> this (.updateHttpsHealthCheckCallable))))

(defn close
  ""
  ([^HttpsHealthCheckClient this]
    (-> this (.close))))

(defn insert-https-health-check
  "Creates a HttpsHealthCheck resource in the specified project using the data included in the
   request.

   Sample code:



   try (HttpsHealthCheckClient httpsHealthCheckClient = HttpsHealthCheckClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     HttpsHealthCheck2 httpsHealthCheckResource = HttpsHealthCheck2.newBuilder().build();
     Operation response = httpsHealthCheckClient.insertHttpsHealthCheck(project, httpsHealthCheckResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  https-health-check-resource - An HttpsHealthCheck resource. This resource defines a template for how individual instances should be checked for health, via HTTPS. - `com.google.cloud.compute.v1.HttpsHealthCheck2`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^HttpsHealthCheckClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.HttpsHealthCheck2 https-health-check-resource]
    (-> this (.insertHttpsHealthCheck project https-health-check-resource)))
  (^com.google.cloud.compute.v1.Operation [^HttpsHealthCheckClient this ^com.google.cloud.compute.v1.InsertHttpsHealthCheckHttpRequest request]
    (-> this (.insertHttpsHealthCheck request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpsHealthCheckClient this]
    (-> this (.isTerminated))))

(defn list-https-health-checks-paged-callable
  "Retrieves the list of HttpsHealthCheck resources available to the specified project.

   Sample code:



   try (HttpsHealthCheckClient httpsHealthCheckClient = HttpsHealthCheckClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListHttpsHealthChecksHttpRequest request = ListHttpsHealthChecksHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListHttpsHealthChecksPagedResponse> future = httpsHealthCheckClient.listHttpsHealthChecksPagedCallable().futureCall(request);
     // Do something
     for (HttpsHealthCheck2 element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListHttpsHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpsHealthCheckClient$ListHttpsHealthChecksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpsHealthCheckClient this]
    (-> this (.listHttpsHealthChecksPagedCallable))))

(defn patch-https-health-check
  "Updates a HttpsHealthCheck resource in the specified project using the data included in the
   request. This method supports PATCH semantics and uses the JSON merge patch format and
   processing rules.

   Sample code:



   try (HttpsHealthCheckClient httpsHealthCheckClient = HttpsHealthCheckClient.create()) {
     ProjectGlobalHttpsHealthCheckName httpsHealthCheck = ProjectGlobalHttpsHealthCheckName.of(\"[PROJECT]\", \"[HTTPS_HEALTH_CHECK]\");
     HttpsHealthCheck2 httpsHealthCheckResource = HttpsHealthCheck2.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = httpsHealthCheckClient.patchHttpsHealthCheck(httpsHealthCheck, httpsHealthCheckResource, fieldMask);
   }

  https-health-check - Name of the HttpsHealthCheck resource to patch. - `com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName`
  https-health-check-resource - An HttpsHealthCheck resource. This resource defines a template for how individual instances should be checked for health, via HTTPS. - `com.google.cloud.compute.v1.HttpsHealthCheck2`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^HttpsHealthCheckClient this ^com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName https-health-check ^com.google.cloud.compute.v1.HttpsHealthCheck2 https-health-check-resource ^java.util.List field-mask]
    (-> this (.patchHttpsHealthCheck https-health-check https-health-check-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^HttpsHealthCheckClient this ^com.google.cloud.compute.v1.PatchHttpsHealthCheckHttpRequest request]
    (-> this (.patchHttpsHealthCheck request))))

(defn delete-https-health-check
  "Deletes the specified HttpsHealthCheck resource.

   Sample code:



   try (HttpsHealthCheckClient httpsHealthCheckClient = HttpsHealthCheckClient.create()) {
     ProjectGlobalHttpsHealthCheckName httpsHealthCheck = ProjectGlobalHttpsHealthCheckName.of(\"[PROJECT]\", \"[HTTPS_HEALTH_CHECK]\");
     Operation response = httpsHealthCheckClient.deleteHttpsHealthCheck(httpsHealthCheck);
   }

  https-health-check - Name of the HttpsHealthCheck resource to delete. - `com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^HttpsHealthCheckClient this ^com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName https-health-check]
    (-> this (.deleteHttpsHealthCheck https-health-check))))

(defn shutdown-now
  ""
  ([^HttpsHealthCheckClient this]
    (-> this (.shutdownNow))))

(defn insert-https-health-check-callable
  "Creates a HttpsHealthCheck resource in the specified project using the data included in the
   request.

   Sample code:



   try (HttpsHealthCheckClient httpsHealthCheckClient = HttpsHealthCheckClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     HttpsHealthCheck2 httpsHealthCheckResource = HttpsHealthCheck2.newBuilder().build();
     InsertHttpsHealthCheckHttpRequest request = InsertHttpsHealthCheckHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setHttpsHealthCheckResource(httpsHealthCheckResource)
       .build();
     ApiFuture<Operation> future = httpsHealthCheckClient.insertHttpsHealthCheckCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpsHealthCheckClient this]
    (-> this (.insertHttpsHealthCheckCallable))))

