(ns com.google.cloud.talent.v4beta1.TenantServiceSettings
  "Settings class to configure an instance of TenantServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (jobs.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createTenant to 30 seconds:



  TenantServiceSettings.Builder tenantServiceSettingsBuilder =
      TenantServiceSettings.newBuilder();
  tenantServiceSettingsBuilder.createTenantSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  TenantServiceSettings tenantServiceSettings = tenantServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 TenantServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (TenantServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (TenantServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (TenantServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.talent.v4beta1.TenantServiceSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.TenantServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (TenantServiceSettings/newBuilder client-context))
  (^com.google.cloud.talent.v4beta1.TenantServiceSettings$Builder []
    (TenantServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (TenantServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.talent.v4beta1.stub.TenantServiceStubSettings`

  returns: `com.google.cloud.talent.v4beta1.TenantServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.TenantServiceSettings [^com.google.cloud.talent.v4beta1.stub.TenantServiceStubSettings stub]
    (TenantServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (TenantServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (TenantServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (TenantServiceSettings/getDefaultServiceScopes )))

(defn create-tenant-settings
  "Returns the object with the settings used for calls to createTenant.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.CreateTenantRequest,com.google.cloud.talent.v4beta1.Tenant>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TenantServiceSettings this]
    (-> this (.createTenantSettings))))

(defn get-tenant-settings
  "Returns the object with the settings used for calls to getTenant.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.GetTenantRequest,com.google.cloud.talent.v4beta1.Tenant>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TenantServiceSettings this]
    (-> this (.getTenantSettings))))

(defn update-tenant-settings
  "Returns the object with the settings used for calls to updateTenant.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.UpdateTenantRequest,com.google.cloud.talent.v4beta1.Tenant>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TenantServiceSettings this]
    (-> this (.updateTenantSettings))))

(defn delete-tenant-settings
  "Returns the object with the settings used for calls to deleteTenant.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.DeleteTenantRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TenantServiceSettings this]
    (-> this (.deleteTenantSettings))))

(defn list-tenants-settings
  "Returns the object with the settings used for calls to listTenants.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.talent.v4beta1.ListTenantsRequest,com.google.cloud.talent.v4beta1.ListTenantsResponse,com.google.cloud.talent.v4beta1.TenantServiceClient$ListTenantsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TenantServiceSettings this]
    (-> this (.listTenantsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.talent.v4beta1.TenantServiceSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.TenantServiceSettings$Builder [^TenantServiceSettings this]
    (-> this (.toBuilder))))

