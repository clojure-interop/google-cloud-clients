(ns com.google.cloud.talent.v4beta1.ApplicationServiceClient
  "Service Description: A service that handles application management, including CRUD and
  enumeration.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (ApplicationServiceClient applicationServiceClient = ApplicationServiceClient.create()) {
    ProfileName parent = ProfileName.of(\"[PROJECT]\", \"[TENANT]\", \"[PROFILE]\");
    Application application = Application.newBuilder().build();
    Application response = applicationServiceClient.createApplication(parent, application);
  }

  Note: close() needs to be called on the applicationServiceClient object to clean up resources
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

  This class can be customized by passing in a custom instance of ApplicationServiceSettings to
  create(). For example:

  To customize credentials:



  ApplicationServiceSettings applicationServiceSettings =
      ApplicationServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  ApplicationServiceClient applicationServiceClient =
      ApplicationServiceClient.create(applicationServiceSettings);

  To customize the endpoint:



  ApplicationServiceSettings applicationServiceSettings =
      ApplicationServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  ApplicationServiceClient applicationServiceClient =
      ApplicationServiceClient.create(applicationServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 ApplicationServiceClient]))

(defn *create
  "Constructs an instance of ApplicationServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.talent.v4beta1.ApplicationServiceSettings`

  returns: `com.google.cloud.talent.v4beta1.ApplicationServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.ApplicationServiceClient [^com.google.cloud.talent.v4beta1.ApplicationServiceSettings settings]
    (ApplicationServiceClient/create settings))
  (^com.google.cloud.talent.v4beta1.ApplicationServiceClient []
    (ApplicationServiceClient/create )))

(defn get-settings
  "returns: `com.google.cloud.talent.v4beta1.ApplicationServiceSettings`"
  (^com.google.cloud.talent.v4beta1.ApplicationServiceSettings [^ApplicationServiceClient this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.talent.v4beta1.stub.ApplicationServiceStub`"
  ([^ApplicationServiceClient this]
    (-> this (.getStub))))

(defn delete-application
  "Deletes specified application.

   Sample code:



   try (ApplicationServiceClient applicationServiceClient = ApplicationServiceClient.create()) {
     ApplicationName name = ApplicationName.of(\"[PROJECT]\", \"[TENANT]\", \"[PROFILE]\", \"[APPLICATION]\");
     applicationServiceClient.deleteApplication(name);
   }

  name - Required. The resource name of the application to be deleted. The format is \"projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}/applications/{application_id}\", for example, \"projects/test-project/tenants/test-tenant/profiles/test-profile/applications/test-application\". - `com.google.cloud.talent.v4beta1.ApplicationName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ApplicationServiceClient this ^com.google.cloud.talent.v4beta1.ApplicationName name]
    (-> this (.deleteApplication name))))

(defn get-application-callable
  "Retrieves specified application.

   Sample code:



   try (ApplicationServiceClient applicationServiceClient = ApplicationServiceClient.create()) {
     ApplicationName name = ApplicationName.of(\"[PROJECT]\", \"[TENANT]\", \"[PROFILE]\", \"[APPLICATION]\");
     GetApplicationRequest request = GetApplicationRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Application> future = applicationServiceClient.getApplicationCallable().futureCall(request);
     // Do something
     Application response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.GetApplicationRequest,com.google.cloud.talent.v4beta1.Application>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ApplicationServiceClient this]
    (-> this (.getApplicationCallable))))

(defn list-applications
  "Lists all applications associated with the profile.

   Sample code:



   try (ApplicationServiceClient applicationServiceClient = ApplicationServiceClient.create()) {
     ProfileName parent = ProfileName.of(\"[PROJECT]\", \"[TENANT]\", \"[PROFILE]\");
     for (Application element : applicationServiceClient.listApplications(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. Resource name of the profile under which the application is created. The format is \"projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}\", for example, \"projects/test-project/tenants/test-tenant/profiles/test-profile\". - `com.google.cloud.talent.v4beta1.ProfileName`

  returns: `com.google.cloud.talent.v4beta1.ApplicationServiceClient$ListApplicationsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.ApplicationServiceClient$ListApplicationsPagedResponse [^ApplicationServiceClient this ^com.google.cloud.talent.v4beta1.ProfileName parent]
    (-> this (.listApplications parent))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^ApplicationServiceClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^ApplicationServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^ApplicationServiceClient this]
    (-> this (.shutdown))))

(defn update-application-callable
  "Updates specified application.

   Sample code:



   try (ApplicationServiceClient applicationServiceClient = ApplicationServiceClient.create()) {
     Application application = Application.newBuilder().build();
     UpdateApplicationRequest request = UpdateApplicationRequest.newBuilder()
       .setApplication(application)
       .build();
     ApiFuture<Application> future = applicationServiceClient.updateApplicationCallable().futureCall(request);
     // Do something
     Application response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.UpdateApplicationRequest,com.google.cloud.talent.v4beta1.Application>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ApplicationServiceClient this]
    (-> this (.updateApplicationCallable))))

(defn update-application
  "Updates specified application.

   Sample code:



   try (ApplicationServiceClient applicationServiceClient = ApplicationServiceClient.create()) {
     Application application = Application.newBuilder().build();
     Application response = applicationServiceClient.updateApplication(application);
   }

  application - Required. The application resource to replace the current resource in the system. - `com.google.cloud.talent.v4beta1.Application`

  returns: `com.google.cloud.talent.v4beta1.Application`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.Application [^ApplicationServiceClient this ^com.google.cloud.talent.v4beta1.Application application]
    (-> this (.updateApplication application))))

(defn create-application
  "Creates a new application entity.

   Sample code:



   try (ApplicationServiceClient applicationServiceClient = ApplicationServiceClient.create()) {
     ProfileName parent = ProfileName.of(\"[PROJECT]\", \"[TENANT]\", \"[PROFILE]\");
     Application application = Application.newBuilder().build();
     Application response = applicationServiceClient.createApplication(parent, application);
   }

  parent - Required. Resource name of the profile under which the application is created. The format is \"projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}\", for example, \"projects/test-project/tenants/test-tenant/profiles/test-profile\". - `com.google.cloud.talent.v4beta1.ProfileName`
  application - Required. The application to be created. - `com.google.cloud.talent.v4beta1.Application`

  returns: `com.google.cloud.talent.v4beta1.Application`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.Application [^ApplicationServiceClient this ^com.google.cloud.talent.v4beta1.ProfileName parent ^com.google.cloud.talent.v4beta1.Application application]
    (-> this (.createApplication parent application)))
  (^com.google.cloud.talent.v4beta1.Application [^ApplicationServiceClient this ^com.google.cloud.talent.v4beta1.CreateApplicationRequest request]
    (-> this (.createApplication request))))

(defn close
  ""
  ([^ApplicationServiceClient this]
    (-> this (.close))))

(defn create-application-callable
  "Creates a new application entity.

   Sample code:



   try (ApplicationServiceClient applicationServiceClient = ApplicationServiceClient.create()) {
     ProfileName parent = ProfileName.of(\"[PROJECT]\", \"[TENANT]\", \"[PROFILE]\");
     Application application = Application.newBuilder().build();
     CreateApplicationRequest request = CreateApplicationRequest.newBuilder()
       .setParent(parent.toString())
       .setApplication(application)
       .build();
     ApiFuture<Application> future = applicationServiceClient.createApplicationCallable().futureCall(request);
     // Do something
     Application response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CreateApplicationRequest,com.google.cloud.talent.v4beta1.Application>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ApplicationServiceClient this]
    (-> this (.createApplicationCallable))))

(defn get-application
  "Retrieves specified application.

   Sample code:



   try (ApplicationServiceClient applicationServiceClient = ApplicationServiceClient.create()) {
     ApplicationName name = ApplicationName.of(\"[PROJECT]\", \"[TENANT]\", \"[PROFILE]\", \"[APPLICATION]\");
     Application response = applicationServiceClient.getApplication(name);
   }

  name - Required. The resource name of the application to be retrieved. The format is \"projects/{project_id}/tenants/{tenant_id}/profiles/{profile_id}/applications/{application_id}\", for example, \"projects/test-project/tenants/test-tenant/profiles/test-profile/applications/test-application\". - `com.google.cloud.talent.v4beta1.ApplicationName`

  returns: `com.google.cloud.talent.v4beta1.Application`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.Application [^ApplicationServiceClient this ^com.google.cloud.talent.v4beta1.ApplicationName name]
    (-> this (.getApplication name))))

(defn delete-application-callable
  "Deletes specified application.

   Sample code:



   try (ApplicationServiceClient applicationServiceClient = ApplicationServiceClient.create()) {
     ApplicationName name = ApplicationName.of(\"[PROJECT]\", \"[TENANT]\", \"[PROFILE]\", \"[APPLICATION]\");
     DeleteApplicationRequest request = DeleteApplicationRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = applicationServiceClient.deleteApplicationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.DeleteApplicationRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ApplicationServiceClient this]
    (-> this (.deleteApplicationCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^ApplicationServiceClient this]
    (-> this (.isTerminated))))

(defn list-applications-callable
  "Lists all applications associated with the profile.

   Sample code:



   try (ApplicationServiceClient applicationServiceClient = ApplicationServiceClient.create()) {
     ProfileName parent = ProfileName.of(\"[PROJECT]\", \"[TENANT]\", \"[PROFILE]\");
     ListApplicationsRequest request = ListApplicationsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListApplicationsResponse response = applicationServiceClient.listApplicationsCallable().call(request);
       for (Application element : response.getApplicationsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListApplicationsRequest,com.google.cloud.talent.v4beta1.ListApplicationsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ApplicationServiceClient this]
    (-> this (.listApplicationsCallable))))

(defn shutdown-now
  ""
  ([^ApplicationServiceClient this]
    (-> this (.shutdownNow))))

(defn list-applications-paged-callable
  "Lists all applications associated with the profile.

   Sample code:



   try (ApplicationServiceClient applicationServiceClient = ApplicationServiceClient.create()) {
     ProfileName parent = ProfileName.of(\"[PROJECT]\", \"[TENANT]\", \"[PROFILE]\");
     ListApplicationsRequest request = ListApplicationsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListApplicationsPagedResponse> future = applicationServiceClient.listApplicationsPagedCallable().futureCall(request);
     // Do something
     for (Application element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListApplicationsRequest,com.google.cloud.talent.v4beta1.ApplicationServiceClient$ListApplicationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ApplicationServiceClient this]
    (-> this (.listApplicationsPagedCallable))))

