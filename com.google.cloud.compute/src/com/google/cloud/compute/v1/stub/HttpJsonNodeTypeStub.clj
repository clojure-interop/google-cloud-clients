(ns com.google.cloud.compute.v1.stub.HttpJsonNodeTypeStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonNodeTypeStub]))

(def *-aggregated-list-node-types-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListNodeTypesHttpRequest,com.google.cloud.compute.v1.NodeTypeAggregatedList>"
  HttpJsonNodeTypeStub/aggregatedListNodeTypesMethodDescriptor)

(def *-get-node-type-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetNodeTypeHttpRequest,com.google.cloud.compute.v1.NodeType>"
  HttpJsonNodeTypeStub/getNodeTypeMethodDescriptor)

(def *-list-node-types-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListNodeTypesHttpRequest,com.google.cloud.compute.v1.NodeTypeList>"
  HttpJsonNodeTypeStub/listNodeTypesMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonNodeTypeStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonNodeTypeStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonNodeTypeStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonNodeTypeStub [^com.google.cloud.compute.v1.stub.NodeTypeStubSettings settings]
    (HttpJsonNodeTypeStub/create settings)))

(defn aggregated-list-node-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNodeTypesHttpRequest,com.google.cloud.compute.v1.NodeTypeAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeTypeStub this]
    (-> this (.aggregatedListNodeTypesCallable))))

(defn aggregated-list-node-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNodeTypesHttpRequest,com.google.cloud.compute.v1.NodeTypeClient$AggregatedListNodeTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeTypeStub this]
    (-> this (.aggregatedListNodeTypesPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonNodeTypeStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonNodeTypeStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonNodeTypeStub this]
    (-> this (.shutdown))))

(defn get-node-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNodeTypeHttpRequest,com.google.cloud.compute.v1.NodeType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeTypeStub this]
    (-> this (.getNodeTypeCallable))))

(defn close
  ""
  ([^HttpJsonNodeTypeStub this]
    (-> this (.close))))

(defn list-node-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodeTypesHttpRequest,com.google.cloud.compute.v1.NodeTypeClient$ListNodeTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeTypeStub this]
    (-> this (.listNodeTypesPagedCallable))))

(defn list-node-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodeTypesHttpRequest,com.google.cloud.compute.v1.NodeTypeList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNodeTypeStub this]
    (-> this (.listNodeTypesCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonNodeTypeStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^HttpJsonNodeTypeStub this]
    (-> this (.shutdownNow))))

