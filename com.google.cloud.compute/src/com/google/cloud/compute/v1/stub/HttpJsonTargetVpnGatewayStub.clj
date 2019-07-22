(ns com.google.cloud.compute.v1.stub.HttpJsonTargetVpnGatewayStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonTargetVpnGatewayStub]))

(def *-aggregated-list-target-vpn-gateways-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList>"
  HttpJsonTargetVpnGatewayStub/aggregatedListTargetVpnGatewaysMethodDescriptor)

(def *-delete-target-vpn-gateway-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetVpnGatewayStub/deleteTargetVpnGatewayMethodDescriptor)

(def *-get-target-vpn-gateway-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.TargetVpnGateway>"
  HttpJsonTargetVpnGatewayStub/getTargetVpnGatewayMethodDescriptor)

(def *-insert-target-vpn-gateway-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonTargetVpnGatewayStub/insertTargetVpnGatewayMethodDescriptor)

(def *-list-target-vpn-gateways-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayList>"
  HttpJsonTargetVpnGatewayStub/listTargetVpnGatewaysMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonTargetVpnGatewayStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonTargetVpnGatewayStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonTargetVpnGatewayStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonTargetVpnGatewayStub [^com.google.cloud.compute.v1.stub.TargetVpnGatewayStubSettings settings]
    (HttpJsonTargetVpnGatewayStub/create settings)))

(defn list-target-vpn-gateways-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetVpnGatewayStub this]
    (-> this (.listTargetVpnGatewaysCallable))))

(defn get-target-vpn-gateway-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.TargetVpnGateway>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetVpnGatewayStub this]
    (-> this (.getTargetVpnGatewayCallable))))

(defn aggregated-list-target-vpn-gateways-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayClient$AggregatedListTargetVpnGatewaysPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetVpnGatewayStub this]
    (-> this (.aggregatedListTargetVpnGatewaysPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonTargetVpnGatewayStub this]
    (-> this (.isShutdown))))

(defn insert-target-vpn-gateway-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetVpnGatewayStub this]
    (-> this (.insertTargetVpnGatewayCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonTargetVpnGatewayStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonTargetVpnGatewayStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^HttpJsonTargetVpnGatewayStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonTargetVpnGatewayStub this]
    (-> this (.isTerminated))))

(defn aggregated-list-target-vpn-gateways-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetVpnGatewayStub this]
    (-> this (.aggregatedListTargetVpnGatewaysCallable))))

(defn list-target-vpn-gateways-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayClient$ListTargetVpnGatewaysPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetVpnGatewayStub this]
    (-> this (.listTargetVpnGatewaysPagedCallable))))

(defn delete-target-vpn-gateway-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonTargetVpnGatewayStub this]
    (-> this (.deleteTargetVpnGatewayCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonTargetVpnGatewayStub this]
    (-> this (.shutdownNow))))

