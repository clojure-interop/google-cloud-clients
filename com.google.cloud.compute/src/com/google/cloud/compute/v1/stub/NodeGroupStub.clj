(ns com.google.cloud.compute.v1.stub.NodeGroupStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub NodeGroupStub]))

(defn ->node-group-stub
  "Constructor."
  (^NodeGroupStub []
    (new NodeGroupStub )))

(defn list-node-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupStub this]
    (-> this (.listNodeGroupsCallable))))

(defn add-nodes-node-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddNodesNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupStub this]
    (-> this (.addNodesNodeGroupCallable))))

(defn insert-node-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupStub this]
    (-> this (.insertNodeGroupCallable))))

(defn list-nodes-node-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodesNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupClient$ListNodesNodeGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupStub this]
    (-> this (.listNodesNodeGroupsPagedCallable))))

(defn get-iam-policy-node-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyNodeGroupHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupStub this]
    (-> this (.getIamPolicyNodeGroupCallable))))

(defn set-iam-policy-node-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyNodeGroupHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupStub this]
    (-> this (.setIamPolicyNodeGroupCallable))))

(defn aggregated-list-node-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupClient$AggregatedListNodeGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupStub this]
    (-> this (.aggregatedListNodeGroupsPagedCallable))))

(defn delete-node-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupStub this]
    (-> this (.deleteNodeGroupCallable))))

(defn set-node-template-node-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupStub this]
    (-> this (.setNodeTemplateNodeGroupCallable))))

(defn test-iam-permissions-node-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsNodeGroupHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupStub this]
    (-> this (.testIamPermissionsNodeGroupCallable))))

(defn list-nodes-node-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodesNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupsListNodes>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupStub this]
    (-> this (.listNodesNodeGroupsCallable))))

(defn list-node-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupClient$ListNodeGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupStub this]
    (-> this (.listNodeGroupsPagedCallable))))

(defn delete-nodes-node-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteNodesNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupStub this]
    (-> this (.deleteNodesNodeGroupCallable))))

(defn close
  ""
  ([^NodeGroupStub this]
    (-> this (.close))))

(defn get-node-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNodeGroupHttpRequest,com.google.cloud.compute.v1.NodeGroup>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupStub this]
    (-> this (.getNodeGroupCallable))))

(defn aggregated-list-node-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeGroupStub this]
    (-> this (.aggregatedListNodeGroupsCallable))))

