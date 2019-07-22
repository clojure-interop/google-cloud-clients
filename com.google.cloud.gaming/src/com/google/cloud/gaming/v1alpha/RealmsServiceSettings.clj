(ns com.google.cloud.gaming.v1alpha.RealmsServiceSettings
  "Settings class to configure an instance of RealmsServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (gameservices.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getRealm to 30 seconds:



  RealmsServiceSettings.Builder realmsServiceSettingsBuilder =
      RealmsServiceSettings.newBuilder();
  realmsServiceSettingsBuilder.getRealmSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RealmsServiceSettings realmsServiceSettings = realmsServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha RealmsServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RealmsServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RealmsServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RealmsServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.gaming.v1alpha.RealmsServiceSettings$Builder`"
  (^com.google.cloud.gaming.v1alpha.RealmsServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RealmsServiceSettings/newBuilder client-context))
  (^com.google.cloud.gaming.v1alpha.RealmsServiceSettings$Builder []
    (RealmsServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RealmsServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.gaming.v1alpha.stub.RealmsServiceStubSettings`

  returns: `com.google.cloud.gaming.v1alpha.RealmsServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.gaming.v1alpha.RealmsServiceSettings [^com.google.cloud.gaming.v1alpha.stub.RealmsServiceStubSettings stub]
    (RealmsServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (RealmsServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RealmsServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RealmsServiceSettings/getDefaultServiceScopes )))

(defn delete-realm-operation-settings
  "Returns the object with the settings used for calls to deleteRealm.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.DeleteRealmRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^RealmsServiceSettings this]
    (-> this (.deleteRealmOperationSettings))))

(defn create-realm-settings
  "Returns the object with the settings used for calls to createRealm.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.CreateRealmRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RealmsServiceSettings this]
    (-> this (.createRealmSettings))))

(defn create-realm-operation-settings
  "Returns the object with the settings used for calls to createRealm.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.CreateRealmRequest,com.google.cloud.gaming.v1alpha.Realm,com.google.protobuf.Empty>`"
  ([^RealmsServiceSettings this]
    (-> this (.createRealmOperationSettings))))

(defn delete-realm-settings
  "Returns the object with the settings used for calls to deleteRealm.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.DeleteRealmRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RealmsServiceSettings this]
    (-> this (.deleteRealmSettings))))

(defn list-realms-settings
  "Returns the object with the settings used for calls to listRealms.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.gaming.v1alpha.ListRealmsRequest,com.google.cloud.gaming.v1alpha.ListRealmsResponse,com.google.cloud.gaming.v1alpha.RealmsServiceClient$ListRealmsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RealmsServiceSettings this]
    (-> this (.listRealmsSettings))))

(defn update-realm-settings
  "Returns the object with the settings used for calls to updateRealm.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.UpdateRealmRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RealmsServiceSettings this]
    (-> this (.updateRealmSettings))))

(defn update-realm-operation-settings
  "Returns the object with the settings used for calls to updateRealm.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.UpdateRealmRequest,com.google.cloud.gaming.v1alpha.Realm,com.google.protobuf.Empty>`"
  ([^RealmsServiceSettings this]
    (-> this (.updateRealmOperationSettings))))

(defn get-realm-settings
  "Returns the object with the settings used for calls to getRealm.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.GetRealmRequest,com.google.cloud.gaming.v1alpha.Realm>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RealmsServiceSettings this]
    (-> this (.getRealmSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.gaming.v1alpha.RealmsServiceSettings$Builder`"
  (^com.google.cloud.gaming.v1alpha.RealmsServiceSettings$Builder [^RealmsServiceSettings this]
    (-> this (.toBuilder))))

