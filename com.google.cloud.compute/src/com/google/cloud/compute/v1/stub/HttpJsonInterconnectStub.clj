(ns com.google.cloud.compute.v1.stub.HttpJsonInterconnectStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonInterconnectStub]))

(def *-delete-interconnect-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInterconnectStub/deleteInterconnectMethodDescriptor)

(def *-get-interconnect-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetInterconnectHttpRequest,com.google.cloud.compute.v1.Interconnect>"
  HttpJsonInterconnectStub/getInterconnectMethodDescriptor)

(def *-get-diagnostics-interconnect-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetDiagnosticsInterconnectHttpRequest,com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse>"
  HttpJsonInterconnectStub/getDiagnosticsInterconnectMethodDescriptor)

(def *-insert-interconnect-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInterconnectStub/insertInterconnectMethodDescriptor)

(def *-list-interconnects-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListInterconnectsHttpRequest,com.google.cloud.compute.v1.InterconnectList>"
  HttpJsonInterconnectStub/listInterconnectsMethodDescriptor)

(def *-patch-interconnect-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonInterconnectStub/patchInterconnectMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonInterconnectStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonInterconnectStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonInterconnectStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonInterconnectStub [^com.google.cloud.compute.v1.stub.InterconnectStubSettings settings]
    (HttpJsonInterconnectStub/create settings)))

(defn get-diagnostics-interconnect-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetDiagnosticsInterconnectHttpRequest,com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInterconnectStub this]
    (-> this (.getDiagnosticsInterconnectCallable))))

(defn insert-interconnect-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInterconnectStub this]
    (-> this (.insertInterconnectCallable))))

(defn list-interconnects-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInterconnectsHttpRequest,com.google.cloud.compute.v1.InterconnectClient$ListInterconnectsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInterconnectStub this]
    (-> this (.listInterconnectsPagedCallable))))

(defn list-interconnects-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInterconnectsHttpRequest,com.google.cloud.compute.v1.InterconnectList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInterconnectStub this]
    (-> this (.listInterconnectsCallable))))

(defn patch-interconnect-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInterconnectStub this]
    (-> this (.patchInterconnectCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonInterconnectStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonInterconnectStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonInterconnectStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^HttpJsonInterconnectStub this]
    (-> this (.close))))

(defn get-interconnect-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInterconnectHttpRequest,com.google.cloud.compute.v1.Interconnect>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInterconnectStub this]
    (-> this (.getInterconnectCallable))))

(defn delete-interconnect-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInterconnectStub this]
    (-> this (.deleteInterconnectCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonInterconnectStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^HttpJsonInterconnectStub this]
    (-> this (.shutdownNow))))

