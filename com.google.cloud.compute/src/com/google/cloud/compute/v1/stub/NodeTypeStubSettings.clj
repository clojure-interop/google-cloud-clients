(ns com.google.cloud.compute.v1.stub.NodeTypeStubSettings
  "Settings class to configure an instance of NodeTypeStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getNodeType to 30 seconds:



  NodeTypeStubSettings.Builder nodeTypeSettingsBuilder =
      NodeTypeStubSettings.newBuilder();
  nodeTypeSettingsBuilder.getNodeTypeSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  NodeTypeStubSettings nodeTypeSettings = nodeTypeSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub NodeTypeStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (NodeTypeStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (NodeTypeStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (NodeTypeStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (NodeTypeStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.NodeTypeStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.NodeTypeStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (NodeTypeStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.NodeTypeStubSettings$Builder []
    (NodeTypeStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (NodeTypeStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (NodeTypeStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (NodeTypeStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (NodeTypeStubSettings/getDefaultServiceScopes )))

(defn aggregated-list-node-types-settings
  "Returns the object with the settings used for calls to aggregatedListNodeTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListNodeTypesHttpRequest,com.google.cloud.compute.v1.NodeTypeAggregatedList,com.google.cloud.compute.v1.NodeTypeClient$AggregatedListNodeTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^NodeTypeStubSettings this]
    (-> this (.aggregatedListNodeTypesSettings))))

(defn get-node-type-settings
  "Returns the object with the settings used for calls to getNodeType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetNodeTypeHttpRequest,com.google.cloud.compute.v1.NodeType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NodeTypeStubSettings this]
    (-> this (.getNodeTypeSettings))))

(defn list-node-types-settings
  "Returns the object with the settings used for calls to listNodeTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListNodeTypesHttpRequest,com.google.cloud.compute.v1.NodeTypeList,com.google.cloud.compute.v1.NodeTypeClient$ListNodeTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^NodeTypeStubSettings this]
    (-> this (.listNodeTypesSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.NodeTypeStub`

  throws: java.io.IOException"
  ([^NodeTypeStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.NodeTypeStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.NodeTypeStubSettings$Builder [^NodeTypeStubSettings this]
    (-> this (.toBuilder))))

