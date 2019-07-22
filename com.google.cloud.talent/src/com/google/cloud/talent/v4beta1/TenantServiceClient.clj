(ns com.google.cloud.talent.v4beta1.TenantServiceClient
  "Service Description: A service that handles tenant management, including CRUD and enumeration.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (TenantServiceClient tenantServiceClient = TenantServiceClient.create()) {
    ProjectName parent = ProjectName.of(\"[PROJECT]\");
    Tenant tenant = Tenant.newBuilder().build();
    Tenant response = tenantServiceClient.createTenant(parent, tenant);
  }

  Note: close() needs to be called on the tenantServiceClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of TenantServiceSettings to
  create(). For example:

  To customize credentials:



  TenantServiceSettings tenantServiceSettings =
      TenantServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  TenantServiceClient tenantServiceClient =
      TenantServiceClient.create(tenantServiceSettings);

  To customize the endpoint:



  TenantServiceSettings tenantServiceSettings =
      TenantServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  TenantServiceClient tenantServiceClient =
      TenantServiceClient.create(tenantServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 TenantServiceClient]))

(defn *create
  "Constructs an instance of TenantServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.talent.v4beta1.TenantServiceSettings`

  returns: `com.google.cloud.talent.v4beta1.TenantServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.TenantServiceClient [^com.google.cloud.talent.v4beta1.TenantServiceSettings settings]
    (TenantServiceClient/create settings))
  (^com.google.cloud.talent.v4beta1.TenantServiceClient []
    (TenantServiceClient/create )))

(defn get-tenant-callable
  "Retrieves specified tenant.

   Sample code:



   try (TenantServiceClient tenantServiceClient = TenantServiceClient.create()) {
     TenantName name = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     GetTenantRequest request = GetTenantRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Tenant> future = tenantServiceClient.getTenantCallable().futureCall(request);
     // Do something
     Tenant response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.GetTenantRequest,com.google.cloud.talent.v4beta1.Tenant>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TenantServiceClient this]
    (-> this (.getTenantCallable))))

(defn list-tenants-callable
  "Lists all tenants associated with the project.

   Sample code:



   try (TenantServiceClient tenantServiceClient = TenantServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListTenantsRequest request = ListTenantsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListTenantsResponse response = tenantServiceClient.listTenantsCallable().call(request);
       for (Tenant element : response.getTenantsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListTenantsRequest,com.google.cloud.talent.v4beta1.ListTenantsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TenantServiceClient this]
    (-> this (.listTenantsCallable))))

(defn list-tenants-paged-callable
  "Lists all tenants associated with the project.

   Sample code:



   try (TenantServiceClient tenantServiceClient = TenantServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ListTenantsRequest request = ListTenantsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListTenantsPagedResponse> future = tenantServiceClient.listTenantsPagedCallable().futureCall(request);
     // Do something
     for (Tenant element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListTenantsRequest,com.google.cloud.talent.v4beta1.TenantServiceClient$ListTenantsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TenantServiceClient this]
    (-> this (.listTenantsPagedCallable))))

(defn get-settings
  "returns: `com.google.cloud.talent.v4beta1.TenantServiceSettings`"
  (^com.google.cloud.talent.v4beta1.TenantServiceSettings [^TenantServiceClient this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.talent.v4beta1.stub.TenantServiceStub`"
  ([^TenantServiceClient this]
    (-> this (.getStub))))

(defn update-tenant
  "Updates specified tenant.

   Sample code:



   try (TenantServiceClient tenantServiceClient = TenantServiceClient.create()) {
     Tenant tenant = Tenant.newBuilder().build();
     Tenant response = tenantServiceClient.updateTenant(tenant);
   }

  tenant - Required. The tenant resource to replace the current resource in the system. - `com.google.cloud.talent.v4beta1.Tenant`

  returns: `com.google.cloud.talent.v4beta1.Tenant`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.Tenant [^TenantServiceClient this ^com.google.cloud.talent.v4beta1.Tenant tenant]
    (-> this (.updateTenant tenant))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^TenantServiceClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^TenantServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn create-tenant-callable
  "Creates a new tenant entity.

   Sample code:



   try (TenantServiceClient tenantServiceClient = TenantServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     Tenant tenant = Tenant.newBuilder().build();
     CreateTenantRequest request = CreateTenantRequest.newBuilder()
       .setParent(parent.toString())
       .setTenant(tenant)
       .build();
     ApiFuture<Tenant> future = tenantServiceClient.createTenantCallable().futureCall(request);
     // Do something
     Tenant response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CreateTenantRequest,com.google.cloud.talent.v4beta1.Tenant>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TenantServiceClient this]
    (-> this (.createTenantCallable))))

(defn delete-tenant-callable
  "Deletes specified tenant.

   Sample code:



   try (TenantServiceClient tenantServiceClient = TenantServiceClient.create()) {
     TenantName name = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     DeleteTenantRequest request = DeleteTenantRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = tenantServiceClient.deleteTenantCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.DeleteTenantRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TenantServiceClient this]
    (-> this (.deleteTenantCallable))))

(defn shutdown
  ""
  ([^TenantServiceClient this]
    (-> this (.shutdown))))

(defn create-tenant
  "Creates a new tenant entity.

   Sample code:



   try (TenantServiceClient tenantServiceClient = TenantServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     Tenant tenant = Tenant.newBuilder().build();
     Tenant response = tenantServiceClient.createTenant(parent, tenant);
   }

  parent - Required. Resource name of the project under which the tenant is created. The format is \"projects/{project_id}\", for example, \"projects/api-test-project\". - `com.google.cloud.talent.v4beta1.ProjectName`
  tenant - Required. The tenant to be created. - `com.google.cloud.talent.v4beta1.Tenant`

  returns: `com.google.cloud.talent.v4beta1.Tenant`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.Tenant [^TenantServiceClient this ^com.google.cloud.talent.v4beta1.ProjectName parent ^com.google.cloud.talent.v4beta1.Tenant tenant]
    (-> this (.createTenant parent tenant)))
  (^com.google.cloud.talent.v4beta1.Tenant [^TenantServiceClient this ^com.google.cloud.talent.v4beta1.CreateTenantRequest request]
    (-> this (.createTenant request))))

(defn list-tenants
  "Lists all tenants associated with the project.

   Sample code:



   try (TenantServiceClient tenantServiceClient = TenantServiceClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     for (Tenant element : tenantServiceClient.listTenants(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. Resource name of the project under which the tenant is created. The format is \"projects/{project_id}\", for example, \"projects/api-test-project\". - `com.google.cloud.talent.v4beta1.ProjectName`

  returns: `com.google.cloud.talent.v4beta1.TenantServiceClient$ListTenantsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.TenantServiceClient$ListTenantsPagedResponse [^TenantServiceClient this ^com.google.cloud.talent.v4beta1.ProjectName parent]
    (-> this (.listTenants parent))))

(defn close
  ""
  ([^TenantServiceClient this]
    (-> this (.close))))

(defn delete-tenant
  "Deletes specified tenant.

   Sample code:



   try (TenantServiceClient tenantServiceClient = TenantServiceClient.create()) {
     TenantName name = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     tenantServiceClient.deleteTenant(name);
   }

  name - Required. The resource name of the tenant to be deleted. The format is \"projects/{project_id}/tenants/{tenant_id}\", for example, \"projects/api-test-project/tenants/foo\". - `com.google.cloud.talent.v4beta1.TenantName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^TenantServiceClient this ^com.google.cloud.talent.v4beta1.TenantName name]
    (-> this (.deleteTenant name))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^TenantServiceClient this]
    (-> this (.isTerminated))))

(defn update-tenant-callable
  "Updates specified tenant.

   Sample code:



   try (TenantServiceClient tenantServiceClient = TenantServiceClient.create()) {
     Tenant tenant = Tenant.newBuilder().build();
     UpdateTenantRequest request = UpdateTenantRequest.newBuilder()
       .setTenant(tenant)
       .build();
     ApiFuture<Tenant> future = tenantServiceClient.updateTenantCallable().futureCall(request);
     // Do something
     Tenant response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.UpdateTenantRequest,com.google.cloud.talent.v4beta1.Tenant>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TenantServiceClient this]
    (-> this (.updateTenantCallable))))

(defn get-tenant
  "Retrieves specified tenant.

   Sample code:



   try (TenantServiceClient tenantServiceClient = TenantServiceClient.create()) {
     TenantName name = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     Tenant response = tenantServiceClient.getTenant(name);
   }

  name - Required. The resource name of the tenant to be retrieved. The format is \"projects/{project_id}/tenants/{tenant_id}\", for example, \"projects/api-test-project/tenants/foo\". - `com.google.cloud.talent.v4beta1.TenantName`

  returns: `com.google.cloud.talent.v4beta1.Tenant`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.Tenant [^TenantServiceClient this ^com.google.cloud.talent.v4beta1.TenantName name]
    (-> this (.getTenant name))))

(defn shutdown-now
  ""
  ([^TenantServiceClient this]
    (-> this (.shutdownNow))))

