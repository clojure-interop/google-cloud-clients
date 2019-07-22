(ns com.google.cloud.compute.v1.stub.HttpJsonNetworkStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonNetworkStub]))

(def *-add-peering-network-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AddPeeringNetworkHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonNetworkStub/addPeeringNetworkMethodDescriptor)

(def *-delete-network-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteNetworkHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonNetworkStub/deleteNetworkMethodDescriptor)

(def *-get-network-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetNetworkHttpRequest,com.google.cloud.compute.v1.Network>"
  HttpJsonNetworkStub/getNetworkMethodDescriptor)

(def *-insert-network-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertNetworkHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonNetworkStub/insertNetworkMethodDescriptor)

(def *-list-networks-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListNetworksHttpRequest,com.google.cloud.compute.v1.NetworkList>"
  HttpJsonNetworkStub/listNetworksMethodDescriptor)

(def *-patch-network-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchNetworkHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonNetworkStub/patchNetworkMethodDescriptor)

(def *-remove-peering-network-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.RemovePeeringNetworkHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonNetworkStub/removePeeringNetworkMethodDescriptor)

(def *-switch-to-custom-mode-network-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SwitchToCustomModeNetworkHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonNetworkStub/switchToCustomModeNetworkMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonNetworkStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonNetworkStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonNetworkStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonNetworkStub [^com.google.cloud.compute.v1.stub.NetworkStubSettings settings]
    (HttpJsonNetworkStub/create settings)))

(defn list-networks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNetworksHttpRequest,com.google.cloud.compute.v1.NetworkClient$ListNetworksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkStub this]
    (-> this (.listNetworksPagedCallable))))

(defn insert-network-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkStub this]
    (-> this (.insertNetworkCallable))))

(defn remove-peering-network-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RemovePeeringNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkStub this]
    (-> this (.removePeeringNetworkCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonNetworkStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonNetworkStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonNetworkStub this]
    (-> this (.shutdown))))

(defn patch-network-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkStub this]
    (-> this (.patchNetworkCallable))))

(defn get-network-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNetworkHttpRequest,com.google.cloud.compute.v1.Network>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkStub this]
    (-> this (.getNetworkCallable))))

(defn switch-to-custom-mode-network-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SwitchToCustomModeNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkStub this]
    (-> this (.switchToCustomModeNetworkCallable))))

(defn close
  ""
  ([^HttpJsonNetworkStub this]
    (-> this (.close))))

(defn delete-network-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkStub this]
    (-> this (.deleteNetworkCallable))))

(defn add-peering-network-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddPeeringNetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkStub this]
    (-> this (.addPeeringNetworkCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonNetworkStub this]
    (-> this (.isTerminated))))

(defn list-networks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNetworksHttpRequest,com.google.cloud.compute.v1.NetworkList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonNetworkStub this]
    (-> this (.listNetworksCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonNetworkStub this]
    (-> this (.shutdownNow))))

