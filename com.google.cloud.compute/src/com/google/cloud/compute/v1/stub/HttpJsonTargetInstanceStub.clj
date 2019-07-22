(ns com.google.cloud.compute.v1.stub.HttpJsonTargetInstanceStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonTargetInstanceStub]))

(def *-aggregated-list-target-instances-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceAggregatedList>"
  HttpJsonTargetInstanceStub/aggregatedListTargetInstancesMethodDescriptor)

(def *-delete-target-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteTargetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetInstanceStub/deleteTargetInstanceMethodDescriptor)

(def *-get-target-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetTargetInstanceHttpRequest,com.google.cloud.compute.v1.TargetInstance>"
  HttpJsonTargetInstanceStub/getTargetInstanceMethodDescriptor)

(def *-insert-target-instance-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertTargetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetInstanceStub/insertTargetInstanceMethodDescriptor)

(def *-list-target-instances-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceList>"
  HttpJsonTargetInstanceStub/listTargetInstancesMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonTargetInstanceStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonTargetInstanceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonTargetInstanceStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonTargetInstanceStub [^com.google.cloud.compute.v1.stub.TargetInstanceStubSettings settings]
    (HttpJsonTargetInstanceStub/create settings)))

(defn delete-target-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetInstanceStub this]
    (-> this (.deleteTargetInstanceCallable))))

(defn aggregated-list-target-instances-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetInstanceStub this]
    (-> this (.aggregatedListTargetInstancesCallable))))

(defn aggregated-list-target-instances-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceClient$AggregatedListTargetInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetInstanceStub this]
    (-> this (.aggregatedListTargetInstancesPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonTargetInstanceStub this]
    (-> this (.isShutdown))))

(defn insert-target-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetInstanceStub this]
    (-> this (.insertTargetInstanceCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonTargetInstanceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonTargetInstanceStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^HttpJsonTargetInstanceStub this]
    (-> this (.close))))

(defn get-target-instance-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetInstanceHttpRequest,com.google.cloud.compute.v1.TargetInstance>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetInstanceStub this]
    (-> this (.getTargetInstanceCallable))))

(defn list-target-instances-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceClient$ListTargetInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetInstanceStub this]
    (-> this (.listTargetInstancesPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonTargetInstanceStub this]
    (-> this (.isTerminated))))

(defn list-target-instances-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetInstanceStub this]
    (-> this (.listTargetInstancesCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonTargetInstanceStub this]
    (-> this (.shutdownNow))))

