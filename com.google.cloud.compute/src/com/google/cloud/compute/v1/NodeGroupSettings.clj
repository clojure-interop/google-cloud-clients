(ns com.google.cloud.compute.v1.NodeGroupSettings
  "Settings class to configure an instance of NodeGroupClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of addNodesNodeGroup to 30 seconds:



  NodeGroupSettings.Builder nodeGroupSettingsBuilder =
      NodeGroupSettings.newBuilder();
  nodeGroupSettingsBuilder.addNodesNodeGroupSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  NodeGroupSettings nodeGroupSettings = nodeGroupSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeGroupSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (NodeGroupSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (NodeGroupSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (NodeGroupSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (NodeGroupSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.NodeGroupSettings$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (NodeGroupSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.NodeGroupSettings$Builder []
    (NodeGroupSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (NodeGroupSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (NodeGroupSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.NodeGroupStubSettings`

  returns: `com.google.cloud.compute.v1.NodeGroupSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.NodeGroupSettings [^com.google.cloud.compute.v1.stub.NodeGroupStubSettings stub]
    (NodeGroupSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (NodeGroupSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (NodeGroupSettings/getDefaultServiceScopes )))

(defn delete-node-group-settings
  "Returns the object with the settings used for calls to deleteNodeGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NodeGroupSettings this]
    (-> this (.deleteNodeGroupSettings))))

(defn insert-node-group-settings
  "Returns the object with the settings used for calls to insertNodeGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NodeGroupSettings this]
    (-> this (.insertNodeGroupSettings))))

(defn get-iam-policy-node-group-settings
  "Returns the object with the settings used for calls to getIamPolicyNodeGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetIamPolicyNodeGroupHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NodeGroupSettings this]
    (-> this (.getIamPolicyNodeGroupSettings))))

(defn delete-nodes-node-group-settings
  "Returns the object with the settings used for calls to deleteNodesNodeGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteNodesNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NodeGroupSettings this]
    (-> this (.deleteNodesNodeGroupSettings))))

(defn set-node-template-node-group-settings
  "Returns the object with the settings used for calls to setNodeTemplateNodeGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NodeGroupSettings this]
    (-> this (.setNodeTemplateNodeGroupSettings))))

(defn add-nodes-node-group-settings
  "Returns the object with the settings used for calls to addNodesNodeGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AddNodesNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NodeGroupSettings this]
    (-> this (.addNodesNodeGroupSettings))))

(defn list-node-groups-settings
  "Returns the object with the settings used for calls to listNodeGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupList,com.google.cloud.compute.v1.NodeGroupClient$ListNodeGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^NodeGroupSettings this]
    (-> this (.listNodeGroupsSettings))))

(defn get-node-group-settings
  "Returns the object with the settings used for calls to getNodeGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetNodeGroupHttpRequest,com.google.cloud.compute.v1.NodeGroup>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NodeGroupSettings this]
    (-> this (.getNodeGroupSettings))))

(defn set-iam-policy-node-group-settings
  "Returns the object with the settings used for calls to setIamPolicyNodeGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetIamPolicyNodeGroupHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NodeGroupSettings this]
    (-> this (.setIamPolicyNodeGroupSettings))))

(defn list-nodes-node-groups-settings
  "Returns the object with the settings used for calls to listNodesNodeGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListNodesNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupsListNodes,com.google.cloud.compute.v1.NodeGroupClient$ListNodesNodeGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^NodeGroupSettings this]
    (-> this (.listNodesNodeGroupsSettings))))

(defn test-iam-permissions-node-group-settings
  "Returns the object with the settings used for calls to testIamPermissionsNodeGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.TestIamPermissionsNodeGroupHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NodeGroupSettings this]
    (-> this (.testIamPermissionsNodeGroupSettings))))

(defn aggregated-list-node-groups-settings
  "Returns the object with the settings used for calls to aggregatedListNodeGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupAggregatedList,com.google.cloud.compute.v1.NodeGroupClient$AggregatedListNodeGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^NodeGroupSettings this]
    (-> this (.aggregatedListNodeGroupsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.NodeGroupSettings$Builder`"
  (^com.google.cloud.compute.v1.NodeGroupSettings$Builder [^NodeGroupSettings this]
    (-> this (.toBuilder))))

