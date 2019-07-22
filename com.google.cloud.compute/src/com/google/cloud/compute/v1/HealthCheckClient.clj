(ns com.google.cloud.compute.v1.HealthCheckClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
    ProjectGlobalHealthCheckName healthCheck = ProjectGlobalHealthCheckName.of(\"[PROJECT]\", \"[HEALTH_CHECK]\");
    Operation response = healthCheckClient.deleteHealthCheck(healthCheck);
  }

  Note: close() needs to be called on the healthCheckClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of HealthCheckSettings to
  create(). For example:

  To customize credentials:



  HealthCheckSettings healthCheckSettings =
      HealthCheckSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  HealthCheckClient healthCheckClient =
      HealthCheckClient.create(healthCheckSettings);

  To customize the endpoint:



  HealthCheckSettings healthCheckSettings =
      HealthCheckSettings.newBuilder().setEndpoint(myEndpoint).build();
  HealthCheckClient healthCheckClient =
      HealthCheckClient.create(healthCheckSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HealthCheckClient]))

(defn *create
  "Constructs an instance of HealthCheckClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.HealthCheckSettings`

  returns: `com.google.cloud.compute.v1.HealthCheckClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.HealthCheckClient [^com.google.cloud.compute.v1.HealthCheckSettings settings]
    (HealthCheckClient/create settings))
  (^com.google.cloud.compute.v1.HealthCheckClient []
    (HealthCheckClient/create )))

(defn patch-health-check-callable
  "Updates a HealthCheck resource in the specified project using the data included in the request.
   This method supports PATCH semantics and uses the JSON merge patch format and processing rules.

   Sample code:



   try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
     String formattedHealthCheck = ProjectGlobalHealthCheckName.format(\"[PROJECT]\", \"[HEALTH_CHECK]\");
     HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     PatchHealthCheckHttpRequest request = PatchHealthCheckHttpRequest.newBuilder()
       .setHealthCheck(formattedHealthCheck)
       .setHealthCheckResource(healthCheckResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = healthCheckClient.patchHealthCheckCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HealthCheckClient this]
    (-> this (.patchHealthCheckCallable))))

(defn update-health-check
  "Updates a HealthCheck resource in the specified project using the data included in the request.

   Sample code:



   try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
     ProjectGlobalHealthCheckName healthCheck = ProjectGlobalHealthCheckName.of(\"[PROJECT]\", \"[HEALTH_CHECK]\");
     HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = healthCheckClient.updateHealthCheck(healthCheck, healthCheckResource, fieldMask);
   }

  health-check - Name of the HealthCheck resource to update. - `com.google.cloud.compute.v1.ProjectGlobalHealthCheckName`
  health-check-resource - An HealthCheck resource. This resource defines a template for how individual virtual machines should be checked for health, via one of the supported protocols. - `com.google.cloud.compute.v1.HealthCheck`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^HealthCheckClient this ^com.google.cloud.compute.v1.ProjectGlobalHealthCheckName health-check ^com.google.cloud.compute.v1.HealthCheck health-check-resource ^java.util.List field-mask]
    (-> this (.updateHealthCheck health-check health-check-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^HealthCheckClient this ^com.google.cloud.compute.v1.UpdateHealthCheckHttpRequest request]
    (-> this (.updateHealthCheck request))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.HealthCheckSettings`"
  (^com.google.cloud.compute.v1.HealthCheckSettings [^HealthCheckClient this]
    (-> this (.getSettings))))

(defn list-health-checks-callable
  "Retrieves the list of HealthCheck resources available to the specified project.

   Sample code:



   try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListHealthChecksHttpRequest request = ListHealthChecksHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       HealthCheckList response = healthCheckClient.listHealthChecksCallable().call(request);
       for (HealthCheck element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListHealthChecksHttpRequest,com.google.cloud.compute.v1.HealthCheckList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HealthCheckClient this]
    (-> this (.listHealthChecksCallable))))

(defn insert-health-check-callable
  "Creates a HealthCheck resource in the specified project using the data included in the request.

   Sample code:



   try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
     InsertHealthCheckHttpRequest request = InsertHealthCheckHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setHealthCheckResource(healthCheckResource)
       .build();
     ApiFuture<Operation> future = healthCheckClient.insertHealthCheckCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HealthCheckClient this]
    (-> this (.insertHealthCheckCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.HealthCheckStub`"
  ([^HealthCheckClient this]
    (-> this (.getStub))))

(defn get-health-check
  "Returns the specified HealthCheck resource. Gets a list of available health checks by making a
   list() request.

   Sample code:



   try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
     ProjectGlobalHealthCheckName healthCheck = ProjectGlobalHealthCheckName.of(\"[PROJECT]\", \"[HEALTH_CHECK]\");
     HealthCheck response = healthCheckClient.getHealthCheck(healthCheck);
   }

  health-check - Name of the HealthCheck resource to return. - `com.google.cloud.compute.v1.ProjectGlobalHealthCheckName`

  returns: `com.google.cloud.compute.v1.HealthCheck`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.HealthCheck [^HealthCheckClient this ^com.google.cloud.compute.v1.ProjectGlobalHealthCheckName health-check]
    (-> this (.getHealthCheck health-check))))

(defn delete-health-check
  "Deletes the specified HealthCheck resource.

   Sample code:



   try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
     ProjectGlobalHealthCheckName healthCheck = ProjectGlobalHealthCheckName.of(\"[PROJECT]\", \"[HEALTH_CHECK]\");
     Operation response = healthCheckClient.deleteHealthCheck(healthCheck);
   }

  health-check - Name of the HealthCheck resource to delete. - `com.google.cloud.compute.v1.ProjectGlobalHealthCheckName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^HealthCheckClient this ^com.google.cloud.compute.v1.ProjectGlobalHealthCheckName health-check]
    (-> this (.deleteHealthCheck health-check))))

(defn list-health-checks
  "Retrieves the list of HealthCheck resources available to the specified project.

   Sample code:



   try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (HealthCheck element : healthCheckClient.listHealthChecks(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.HealthCheckClient$ListHealthChecksPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.HealthCheckClient$ListHealthChecksPagedResponse [^HealthCheckClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listHealthChecks project))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HealthCheckClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HealthCheckClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HealthCheckClient this]
    (-> this (.shutdown))))

(defn delete-health-check-callable
  "Deletes the specified HealthCheck resource.

   Sample code:



   try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
     String formattedHealthCheck = ProjectGlobalHealthCheckName.format(\"[PROJECT]\", \"[HEALTH_CHECK]\");
     DeleteHealthCheckHttpRequest request = DeleteHealthCheckHttpRequest.newBuilder()
       .setHealthCheck(formattedHealthCheck)
       .build();
     ApiFuture<Operation> future = healthCheckClient.deleteHealthCheckCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HealthCheckClient this]
    (-> this (.deleteHealthCheckCallable))))

(defn insert-health-check
  "Creates a HealthCheck resource in the specified project using the data included in the request.

   Sample code:



   try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
     Operation response = healthCheckClient.insertHealthCheck(project, healthCheckResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  health-check-resource - An HealthCheck resource. This resource defines a template for how individual virtual machines should be checked for health, via one of the supported protocols. - `com.google.cloud.compute.v1.HealthCheck`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^HealthCheckClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.HealthCheck health-check-resource]
    (-> this (.insertHealthCheck project health-check-resource)))
  (^com.google.cloud.compute.v1.Operation [^HealthCheckClient this ^com.google.cloud.compute.v1.InsertHealthCheckHttpRequest request]
    (-> this (.insertHealthCheck request))))

(defn close
  ""
  ([^HealthCheckClient this]
    (-> this (.close))))

(defn get-health-check-callable
  "Returns the specified HealthCheck resource. Gets a list of available health checks by making a
   list() request.

   Sample code:



   try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
     String formattedHealthCheck = ProjectGlobalHealthCheckName.format(\"[PROJECT]\", \"[HEALTH_CHECK]\");
     GetHealthCheckHttpRequest request = GetHealthCheckHttpRequest.newBuilder()
       .setHealthCheck(formattedHealthCheck)
       .build();
     ApiFuture<HealthCheck> future = healthCheckClient.getHealthCheckCallable().futureCall(request);
     // Do something
     HealthCheck response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetHealthCheckHttpRequest,com.google.cloud.compute.v1.HealthCheck>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HealthCheckClient this]
    (-> this (.getHealthCheckCallable))))

(defn update-health-check-callable
  "Updates a HealthCheck resource in the specified project using the data included in the request.

   Sample code:



   try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
     String formattedHealthCheck = ProjectGlobalHealthCheckName.format(\"[PROJECT]\", \"[HEALTH_CHECK]\");
     HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     UpdateHealthCheckHttpRequest request = UpdateHealthCheckHttpRequest.newBuilder()
       .setHealthCheck(formattedHealthCheck)
       .setHealthCheckResource(healthCheckResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = healthCheckClient.updateHealthCheckCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HealthCheckClient this]
    (-> this (.updateHealthCheckCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HealthCheckClient this]
    (-> this (.isTerminated))))

(defn list-health-checks-paged-callable
  "Retrieves the list of HealthCheck resources available to the specified project.

   Sample code:



   try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListHealthChecksHttpRequest request = ListHealthChecksHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListHealthChecksPagedResponse> future = healthCheckClient.listHealthChecksPagedCallable().futureCall(request);
     // Do something
     for (HealthCheck element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListHealthChecksHttpRequest,com.google.cloud.compute.v1.HealthCheckClient$ListHealthChecksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HealthCheckClient this]
    (-> this (.listHealthChecksPagedCallable))))

(defn patch-health-check
  "Updates a HealthCheck resource in the specified project using the data included in the request.
   This method supports PATCH semantics and uses the JSON merge patch format and processing rules.

   Sample code:



   try (HealthCheckClient healthCheckClient = HealthCheckClient.create()) {
     ProjectGlobalHealthCheckName healthCheck = ProjectGlobalHealthCheckName.of(\"[PROJECT]\", \"[HEALTH_CHECK]\");
     HealthCheck healthCheckResource = HealthCheck.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = healthCheckClient.patchHealthCheck(healthCheck, healthCheckResource, fieldMask);
   }

  health-check - Name of the HealthCheck resource to patch. - `com.google.cloud.compute.v1.ProjectGlobalHealthCheckName`
  health-check-resource - An HealthCheck resource. This resource defines a template for how individual virtual machines should be checked for health, via one of the supported protocols. - `com.google.cloud.compute.v1.HealthCheck`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^HealthCheckClient this ^com.google.cloud.compute.v1.ProjectGlobalHealthCheckName health-check ^com.google.cloud.compute.v1.HealthCheck health-check-resource ^java.util.List field-mask]
    (-> this (.patchHealthCheck health-check health-check-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^HealthCheckClient this ^com.google.cloud.compute.v1.PatchHealthCheckHttpRequest request]
    (-> this (.patchHealthCheck request))))

(defn shutdown-now
  ""
  ([^HealthCheckClient this]
    (-> this (.shutdownNow))))

