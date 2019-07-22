(ns com.google.cloud.compute.v1.stub.NodeGroupStubSettings$Builder
  "Builder for NodeGroupStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub NodeGroupStubSettings$Builder]))

(defn delete-node-group-settings
  "Returns the builder for the settings used for calls to deleteNodeGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NodeGroupStubSettings$Builder this]
    (-> this (.deleteNodeGroupSettings))))

(defn insert-node-group-settings
  "Returns the builder for the settings used for calls to insertNodeGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NodeGroupStubSettings$Builder this]
    (-> this (.insertNodeGroupSettings))))

(defn get-iam-policy-node-group-settings
  "Returns the builder for the settings used for calls to getIamPolicyNodeGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetIamPolicyNodeGroupHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NodeGroupStubSettings$Builder this]
    (-> this (.getIamPolicyNodeGroupSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.NodeGroupStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.NodeGroupStubSettings$Builder [^NodeGroupStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-nodes-node-group-settings
  "Returns the builder for the settings used for calls to deleteNodesNodeGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteNodesNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NodeGroupStubSettings$Builder this]
    (-> this (.deleteNodesNodeGroupSettings))))

(defn set-node-template-node-group-settings
  "Returns the builder for the settings used for calls to setNodeTemplateNodeGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NodeGroupStubSettings$Builder this]
    (-> this (.setNodeTemplateNodeGroupSettings))))

(defn add-nodes-node-group-settings
  "Returns the builder for the settings used for calls to addNodesNodeGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.AddNodesNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NodeGroupStubSettings$Builder this]
    (-> this (.addNodesNodeGroupSettings))))

(defn list-node-groups-settings
  "Returns the builder for the settings used for calls to listNodeGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupList,com.google.cloud.compute.v1.NodeGroupClient$ListNodeGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^NodeGroupStubSettings$Builder this]
    (-> this (.listNodeGroupsSettings))))

(defn get-node-group-settings
  "Returns the builder for the settings used for calls to getNodeGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetNodeGroupHttpRequest,com.google.cloud.compute.v1.NodeGroup>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NodeGroupStubSettings$Builder this]
    (-> this (.getNodeGroupSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.NodeGroupStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.NodeGroupStubSettings [^NodeGroupStubSettings$Builder this]
    (-> this (.build))))

(defn set-iam-policy-node-group-settings
  "Returns the builder for the settings used for calls to setIamPolicyNodeGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetIamPolicyNodeGroupHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NodeGroupStubSettings$Builder this]
    (-> this (.setIamPolicyNodeGroupSettings))))

(defn list-nodes-node-groups-settings
  "Returns the builder for the settings used for calls to listNodesNodeGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListNodesNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupsListNodes,com.google.cloud.compute.v1.NodeGroupClient$ListNodesNodeGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^NodeGroupStubSettings$Builder this]
    (-> this (.listNodesNodeGroupsSettings))))

(defn test-iam-permissions-node-group-settings
  "Returns the builder for the settings used for calls to testIamPermissionsNodeGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.TestIamPermissionsNodeGroupHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NodeGroupStubSettings$Builder this]
    (-> this (.testIamPermissionsNodeGroupSettings))))

(defn aggregated-list-node-groups-settings
  "Returns the builder for the settings used for calls to aggregatedListNodeGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupAggregatedList,com.google.cloud.compute.v1.NodeGroupClient$AggregatedListNodeGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^NodeGroupStubSettings$Builder this]
    (-> this (.aggregatedListNodeGroupsSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^NodeGroupStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

