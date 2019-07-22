(ns com.google.cloud.compute.v1.stub.HttpJsonVpnTunnelStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonVpnTunnelStub]))

(def *-aggregated-list-vpn-tunnels-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListVpnTunnelsHttpRequest,com.google.cloud.compute.v1.VpnTunnelAggregatedList>"
  HttpJsonVpnTunnelStub/aggregatedListVpnTunnelsMethodDescriptor)

(def *-delete-vpn-tunnel-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteVpnTunnelHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonVpnTunnelStub/deleteVpnTunnelMethodDescriptor)

(def *-get-vpn-tunnel-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetVpnTunnelHttpRequest,com.google.cloud.compute.v1.VpnTunnel>"
  HttpJsonVpnTunnelStub/getVpnTunnelMethodDescriptor)

(def *-insert-vpn-tunnel-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertVpnTunnelHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonVpnTunnelStub/insertVpnTunnelMethodDescriptor)

(def *-list-vpn-tunnels-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListVpnTunnelsHttpRequest,com.google.cloud.compute.v1.VpnTunnelList>"
  HttpJsonVpnTunnelStub/listVpnTunnelsMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonVpnTunnelStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonVpnTunnelStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonVpnTunnelStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonVpnTunnelStub [^com.google.cloud.compute.v1.stub.VpnTunnelStubSettings settings]
    (HttpJsonVpnTunnelStub/create settings)))

(defn list-vpn-tunnels-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListVpnTunnelsHttpRequest,com.google.cloud.compute.v1.VpnTunnelClient$ListVpnTunnelsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonVpnTunnelStub this]
    (-> this (.listVpnTunnelsPagedCallable))))

(defn list-vpn-tunnels-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListVpnTunnelsHttpRequest,com.google.cloud.compute.v1.VpnTunnelList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonVpnTunnelStub this]
    (-> this (.listVpnTunnelsCallable))))

(defn insert-vpn-tunnel-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertVpnTunnelHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonVpnTunnelStub this]
    (-> this (.insertVpnTunnelCallable))))

(defn aggregated-list-vpn-tunnels-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListVpnTunnelsHttpRequest,com.google.cloud.compute.v1.VpnTunnelClient$AggregatedListVpnTunnelsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonVpnTunnelStub this]
    (-> this (.aggregatedListVpnTunnelsPagedCallable))))

(defn get-vpn-tunnel-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetVpnTunnelHttpRequest,com.google.cloud.compute.v1.VpnTunnel>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonVpnTunnelStub this]
    (-> this (.getVpnTunnelCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonVpnTunnelStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonVpnTunnelStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonVpnTunnelStub this]
    (-> this (.shutdown))))

(defn aggregated-list-vpn-tunnels-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListVpnTunnelsHttpRequest,com.google.cloud.compute.v1.VpnTunnelAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonVpnTunnelStub this]
    (-> this (.aggregatedListVpnTunnelsCallable))))

(defn delete-vpn-tunnel-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteVpnTunnelHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonVpnTunnelStub this]
    (-> this (.deleteVpnTunnelCallable))))

(defn close
  ""
  ([^HttpJsonVpnTunnelStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonVpnTunnelStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^HttpJsonVpnTunnelStub this]
    (-> this (.shutdownNow))))

