(ns com.google.cloud.gaming.v1alpha.stub.RealmsServiceStubSettings
  "Settings class to configure an instance of RealmsServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (gameservices.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getRealm to 30 seconds:



  RealmsServiceStubSettings.Builder realmsServiceSettingsBuilder =
      RealmsServiceStubSettings.newBuilder();
  realmsServiceSettingsBuilder.getRealmSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RealmsServiceStubSettings realmsServiceSettings = realmsServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha.stub RealmsServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RealmsServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RealmsServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RealmsServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RealmsServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (RealmsServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RealmsServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RealmsServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.gaming.v1alpha.stub.RealmsServiceStubSettings$Builder`"
  (^com.google.cloud.gaming.v1alpha.stub.RealmsServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RealmsServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.gaming.v1alpha.stub.RealmsServiceStubSettings$Builder []
    (RealmsServiceStubSettings/newBuilder )))

(defn delete-realm-operation-settings
  "Returns the object with the settings used for calls to deleteRealm.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.DeleteRealmRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^RealmsServiceStubSettings this]
    (-> this (.deleteRealmOperationSettings))))

(defn create-realm-settings
  "Returns the object with the settings used for calls to createRealm.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.CreateRealmRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RealmsServiceStubSettings this]
    (-> this (.createRealmSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.gaming.v1alpha.stub.RealmsServiceStub`

  throws: java.io.IOException"
  ([^RealmsServiceStubSettings this]
    (-> this (.createStub))))

(defn create-realm-operation-settings
  "Returns the object with the settings used for calls to createRealm.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.CreateRealmRequest,com.google.cloud.gaming.v1alpha.Realm,com.google.protobuf.Empty>`"
  ([^RealmsServiceStubSettings this]
    (-> this (.createRealmOperationSettings))))

(defn delete-realm-settings
  "Returns the object with the settings used for calls to deleteRealm.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.DeleteRealmRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RealmsServiceStubSettings this]
    (-> this (.deleteRealmSettings))))

(defn list-realms-settings
  "Returns the object with the settings used for calls to listRealms.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.gaming.v1alpha.ListRealmsRequest,com.google.cloud.gaming.v1alpha.ListRealmsResponse,com.google.cloud.gaming.v1alpha.RealmsServiceClient$ListRealmsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RealmsServiceStubSettings this]
    (-> this (.listRealmsSettings))))

(defn update-realm-settings
  "Returns the object with the settings used for calls to updateRealm.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.UpdateRealmRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RealmsServiceStubSettings this]
    (-> this (.updateRealmSettings))))

(defn update-realm-operation-settings
  "Returns the object with the settings used for calls to updateRealm.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.UpdateRealmRequest,com.google.cloud.gaming.v1alpha.Realm,com.google.protobuf.Empty>`"
  ([^RealmsServiceStubSettings this]
    (-> this (.updateRealmOperationSettings))))

(defn get-realm-settings
  "Returns the object with the settings used for calls to getRealm.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.GetRealmRequest,com.google.cloud.gaming.v1alpha.Realm>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RealmsServiceStubSettings this]
    (-> this (.getRealmSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.gaming.v1alpha.stub.RealmsServiceStubSettings$Builder`"
  (^com.google.cloud.gaming.v1alpha.stub.RealmsServiceStubSettings$Builder [^RealmsServiceStubSettings this]
    (-> this (.toBuilder))))

