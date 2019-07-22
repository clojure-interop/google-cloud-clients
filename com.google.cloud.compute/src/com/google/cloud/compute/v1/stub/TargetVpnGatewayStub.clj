(ns com.google.cloud.compute.v1.stub.TargetVpnGatewayStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub TargetVpnGatewayStub]))

(defn ->target-vpn-gateway-stub
  "Constructor."
  (^TargetVpnGatewayStub []
    (new TargetVpnGatewayStub )))

(defn aggregated-list-target-vpn-gateways-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayClient$AggregatedListTargetVpnGatewaysPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetVpnGatewayStub this]
    (-> this (.aggregatedListTargetVpnGatewaysPagedCallable))))

(defn aggregated-list-target-vpn-gateways-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetVpnGatewayStub this]
    (-> this (.aggregatedListTargetVpnGatewaysCallable))))

(defn delete-target-vpn-gateway-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetVpnGatewayStub this]
    (-> this (.deleteTargetVpnGatewayCallable))))

(defn get-target-vpn-gateway-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.TargetVpnGateway>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetVpnGatewayStub this]
    (-> this (.getTargetVpnGatewayCallable))))

(defn insert-target-vpn-gateway-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertTargetVpnGatewayHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetVpnGatewayStub this]
    (-> this (.insertTargetVpnGatewayCallable))))

(defn list-target-vpn-gateways-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayClient$ListTargetVpnGatewaysPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetVpnGatewayStub this]
    (-> this (.listTargetVpnGatewaysPagedCallable))))

(defn list-target-vpn-gateways-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListTargetVpnGatewaysHttpRequest,com.google.cloud.compute.v1.TargetVpnGatewayList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TargetVpnGatewayStub this]
    (-> this (.listTargetVpnGatewaysCallable))))

(defn close
  ""
  ([^TargetVpnGatewayStub this]
    (-> this (.close))))

