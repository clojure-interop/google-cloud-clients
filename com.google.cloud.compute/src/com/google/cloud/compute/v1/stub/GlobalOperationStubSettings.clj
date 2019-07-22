(ns com.google.cloud.compute.v1.stub.GlobalOperationStubSettings
  "Settings class to configure an instance of GlobalOperationStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteGlobalOperation to 30 seconds:



  GlobalOperationStubSettings.Builder globalOperationSettingsBuilder =
      GlobalOperationStubSettings.newBuilder();
  globalOperationSettingsBuilder.deleteGlobalOperationSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  GlobalOperationStubSettings globalOperationSettings = globalOperationSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub GlobalOperationStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (GlobalOperationStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (GlobalOperationStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (GlobalOperationStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (GlobalOperationStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.GlobalOperationStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.GlobalOperationStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (GlobalOperationStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.GlobalOperationStubSettings$Builder []
    (GlobalOperationStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (GlobalOperationStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (GlobalOperationStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (GlobalOperationStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (GlobalOperationStubSettings/getDefaultServiceScopes )))

(defn aggregated-list-global-operations-settings
  "Returns the object with the settings used for calls to aggregatedListGlobalOperations.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.OperationAggregatedList,com.google.cloud.compute.v1.GlobalOperationClient$AggregatedListGlobalOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^GlobalOperationStubSettings this]
    (-> this (.aggregatedListGlobalOperationsSettings))))

(defn delete-global-operation-settings
  "Returns the object with the settings used for calls to deleteGlobalOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteGlobalOperationHttpRequest,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GlobalOperationStubSettings this]
    (-> this (.deleteGlobalOperationSettings))))

(defn get-global-operation-settings
  "Returns the object with the settings used for calls to getGlobalOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetGlobalOperationHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GlobalOperationStubSettings this]
    (-> this (.getGlobalOperationSettings))))

(defn list-global-operations-settings
  "Returns the object with the settings used for calls to listGlobalOperations.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.OperationList,com.google.cloud.compute.v1.GlobalOperationClient$ListGlobalOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^GlobalOperationStubSettings this]
    (-> this (.listGlobalOperationsSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.GlobalOperationStub`

  throws: java.io.IOException"
  ([^GlobalOperationStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.GlobalOperationStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.GlobalOperationStubSettings$Builder [^GlobalOperationStubSettings this]
    (-> this (.toBuilder))))

