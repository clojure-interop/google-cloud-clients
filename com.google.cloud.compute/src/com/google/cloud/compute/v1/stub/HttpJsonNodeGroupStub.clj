(ns com.google.cloud.compute.v1.stub.HttpJsonNodeGroupStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonNodeGroupStub]))

(def *-add-nodes-node-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AddNodesNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonNodeGroupStub/addNodesNodeGroupMethodDescriptor)

(def *-aggregated-list-node-groups-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupAggregatedList>"
  HttpJsonNodeGroupStub/aggregatedListNodeGroupsMethodDescriptor)

(def *-delete-node-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonNodeGroupStub/deleteNodeGroupMethodDescriptor)

(def *-delete-nodes-node-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteNodesNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonNodeGroupStub/deleteNodesNodeGroupMethodDescriptor)

(def *-get-node-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetNodeGroupHttpRequest,com.google.cloud.compute.v1.NodeGroup>"
  HttpJsonNodeGroupStub/getNodeGroupMethodDescriptor)

(def *-get-iam-policy-node-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetIamPolicyNodeGroupHttpRequest,com.google.cloud.compute.v1.Policy>"
  HttpJsonNodeGroupStub/getIamPolicyNodeGroupMethodDescriptor)

(def *-insert-node-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonNodeGroupStub/insertNodeGroupMethodDescriptor)

(def *-list-node-groups-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupList>"
  HttpJsonNodeGroupStub/listNodeGroupsMethodDescriptor)

(def *-list-nodes-node-groups-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListNodesNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupsListNodes>"
  HttpJsonNodeGroupStub/listNodesNodeGroupsMethodDescriptor)

(def *-set-iam-policy-node-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetIamPolicyNodeGroupHttpRequest,com.google.cloud.compute.v1.Policy>"
  HttpJsonNodeGroupStub/setIamPolicyNodeGroupMethodDescriptor)

(def *-set-node-template-node-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonNodeGroupStub/setNodeTemplateNodeGroupMethodDescriptor)

(def *-test-iam-permissions-node-group-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.TestIamPermissionsNodeGroupHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>"
  HttpJsonNodeGroupStub/testIamPermissionsNodeGroupMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonNodeGroupStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonNodeGroupStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonNodeGroupStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonNodeGroupStub [^com.google.cloud.compute.v1.stub.NodeGroupStubSettings settings]
    (HttpJsonNodeGroupStub/create settings)))

(defn list-node-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeGroupStub this]
    (-> this (.listNodeGroupsCallable))))

(defn add-nodes-node-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddNodesNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeGroupStub this]
    (-> this (.addNodesNodeGroupCallable))))

(defn insert-node-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeGroupStub this]
    (-> this (.insertNodeGroupCallable))))

(defn list-nodes-node-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodesNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupClient$ListNodesNodeGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeGroupStub this]
    (-> this (.listNodesNodeGroupsPagedCallable))))

(defn get-iam-policy-node-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyNodeGroupHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeGroupStub this]
    (-> this (.getIamPolicyNodeGroupCallable))))

(defn set-iam-policy-node-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyNodeGroupHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeGroupStub this]
    (-> this (.setIamPolicyNodeGroupCallable))))

(defn aggregated-list-node-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupClient$AggregatedListNodeGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeGroupStub this]
    (-> this (.aggregatedListNodeGroupsPagedCallable))))

(defn delete-node-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeGroupStub this]
    (-> this (.deleteNodeGroupCallable))))

(defn set-node-template-node-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeGroupStub this]
    (-> this (.setNodeTemplateNodeGroupCallable))))

(defn test-iam-permissions-node-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsNodeGroupHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeGroupStub this]
    (-> this (.testIamPermissionsNodeGroupCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonNodeGroupStub this]
    (-> this (.isShutdown))))

(defn list-nodes-node-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodesNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupsListNodes>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeGroupStub this]
    (-> this (.listNodesNodeGroupsCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonNodeGroupStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn list-node-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupClient$ListNodeGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeGroupStub this]
    (-> this (.listNodeGroupsPagedCallable))))

(defn shutdown
  ""
  ([^HttpJsonNodeGroupStub this]
    (-> this (.shutdown))))

(defn delete-nodes-node-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteNodesNodeGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeGroupStub this]
    (-> this (.deleteNodesNodeGroupCallable))))

(defn close
  ""
  ([^HttpJsonNodeGroupStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonNodeGroupStub this]
    (-> this (.isTerminated))))

(defn get-node-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNodeGroupHttpRequest,com.google.cloud.compute.v1.NodeGroup>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeGroupStub this]
    (-> this (.getNodeGroupCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonNodeGroupStub this]
    (-> this (.shutdownNow))))

(defn aggregated-list-node-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNodeGroupsHttpRequest,com.google.cloud.compute.v1.NodeGroupAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeGroupStub this]
    (-> this (.aggregatedListNodeGroupsCallable))))

