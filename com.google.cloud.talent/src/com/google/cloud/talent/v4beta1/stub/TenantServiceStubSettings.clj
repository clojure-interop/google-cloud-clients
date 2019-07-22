(ns com.google.cloud.talent.v4beta1.stub.TenantServiceStubSettings
  "Settings class to configure an instance of TenantServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (jobs.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createTenant to 30 seconds:



  TenantServiceStubSettings.Builder tenantServiceSettingsBuilder =
      TenantServiceStubSettings.newBuilder();
  tenantServiceSettingsBuilder.createTenantSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  TenantServiceStubSettings tenantServiceSettings = tenantServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub TenantServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (TenantServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (TenantServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (TenantServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (TenantServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (TenantServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (TenantServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (TenantServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.talent.v4beta1.stub.TenantServiceStubSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.stub.TenantServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (TenantServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.talent.v4beta1.stub.TenantServiceStubSettings$Builder []
    (TenantServiceStubSettings/newBuilder )))

(defn create-tenant-settings
  "Returns the object with the settings used for calls to createTenant.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.CreateTenantRequest,com.google.cloud.talent.v4beta1.Tenant>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TenantServiceStubSettings this]
    (-> this (.createTenantSettings))))

(defn get-tenant-settings
  "Returns the object with the settings used for calls to getTenant.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.GetTenantRequest,com.google.cloud.talent.v4beta1.Tenant>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TenantServiceStubSettings this]
    (-> this (.getTenantSettings))))

(defn update-tenant-settings
  "Returns the object with the settings used for calls to updateTenant.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.UpdateTenantRequest,com.google.cloud.talent.v4beta1.Tenant>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TenantServiceStubSettings this]
    (-> this (.updateTenantSettings))))

(defn delete-tenant-settings
  "Returns the object with the settings used for calls to deleteTenant.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.DeleteTenantRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TenantServiceStubSettings this]
    (-> this (.deleteTenantSettings))))

(defn list-tenants-settings
  "Returns the object with the settings used for calls to listTenants.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.talent.v4beta1.ListTenantsRequest,com.google.cloud.talent.v4beta1.ListTenantsResponse,com.google.cloud.talent.v4beta1.TenantServiceClient$ListTenantsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TenantServiceStubSettings this]
    (-> this (.listTenantsSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.talent.v4beta1.stub.TenantServiceStub`

  throws: java.io.IOException"
  ([^TenantServiceStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.talent.v4beta1.stub.TenantServiceStubSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.stub.TenantServiceStubSettings$Builder [^TenantServiceStubSettings this]
    (-> this (.toBuilder))))

