(ns com.google.cloud.compute.v1.GlobalOperationSettings
  "Settings class to configure an instance of GlobalOperationClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteGlobalOperation to 30 seconds:



  GlobalOperationSettings.Builder globalOperationSettingsBuilder =
      GlobalOperationSettings.newBuilder();
  globalOperationSettingsBuilder.deleteGlobalOperationSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  GlobalOperationSettings globalOperationSettings = globalOperationSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GlobalOperationSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (GlobalOperationSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (GlobalOperationSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (GlobalOperationSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (GlobalOperationSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.GlobalOperationSettings$Builder`"
  (^com.google.cloud.compute.v1.GlobalOperationSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (GlobalOperationSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.GlobalOperationSettings$Builder []
    (GlobalOperationSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (GlobalOperationSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (GlobalOperationSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.GlobalOperationStubSettings`

  returns: `com.google.cloud.compute.v1.GlobalOperationSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.GlobalOperationSettings [^com.google.cloud.compute.v1.stub.GlobalOperationStubSettings stub]
    (GlobalOperationSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (GlobalOperationSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (GlobalOperationSettings/getDefaultServiceScopes )))

(defn aggregated-list-global-operations-settings
  "Returns the object with the settings used for calls to aggregatedListGlobalOperations.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.OperationAggregatedList,com.google.cloud.compute.v1.GlobalOperationClient$AggregatedListGlobalOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^GlobalOperationSettings this]
    (-> this (.aggregatedListGlobalOperationsSettings))))

(defn delete-global-operation-settings
  "Returns the object with the settings used for calls to deleteGlobalOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteGlobalOperationHttpRequest,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GlobalOperationSettings this]
    (-> this (.deleteGlobalOperationSettings))))

(defn get-global-operation-settings
  "Returns the object with the settings used for calls to getGlobalOperation.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetGlobalOperationHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GlobalOperationSettings this]
    (-> this (.getGlobalOperationSettings))))

(defn list-global-operations-settings
  "Returns the object with the settings used for calls to listGlobalOperations.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.OperationList,com.google.cloud.compute.v1.GlobalOperationClient$ListGlobalOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^GlobalOperationSettings this]
    (-> this (.listGlobalOperationsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.GlobalOperationSettings$Builder`"
  (^com.google.cloud.compute.v1.GlobalOperationSettings$Builder [^GlobalOperationSettings this]
    (-> this (.toBuilder))))

