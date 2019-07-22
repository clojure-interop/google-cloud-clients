(ns com.google.cloud.monitoring.v3.stub.UptimeCheckServiceStub
  "Base stub class for Stackdriver Monitoring API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3.stub UptimeCheckServiceStub]))

(defn ->uptime-check-service-stub
  "Constructor."
  (^UptimeCheckServiceStub []
    (new UptimeCheckServiceStub )))

(defn list-uptime-check-ips-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListUptimeCheckIpsRequest,com.google.monitoring.v3.ListUptimeCheckIpsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UptimeCheckServiceStub this]
    (-> this (.listUptimeCheckIpsCallable))))

(defn list-uptime-check-ips-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListUptimeCheckIpsRequest,com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckIpsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UptimeCheckServiceStub this]
    (-> this (.listUptimeCheckIpsPagedCallable))))

(defn list-uptime-check-configs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListUptimeCheckConfigsRequest,com.google.monitoring.v3.ListUptimeCheckConfigsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UptimeCheckServiceStub this]
    (-> this (.listUptimeCheckConfigsCallable))))

(defn get-uptime-check-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetUptimeCheckConfigRequest,com.google.monitoring.v3.UptimeCheckConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UptimeCheckServiceStub this]
    (-> this (.getUptimeCheckConfigCallable))))

(defn create-uptime-check-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.CreateUptimeCheckConfigRequest,com.google.monitoring.v3.UptimeCheckConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UptimeCheckServiceStub this]
    (-> this (.createUptimeCheckConfigCallable))))

(defn delete-uptime-check-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.DeleteUptimeCheckConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UptimeCheckServiceStub this]
    (-> this (.deleteUptimeCheckConfigCallable))))

(defn close
  ""
  ([^UptimeCheckServiceStub this]
    (-> this (.close))))

(defn update-uptime-check-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.UpdateUptimeCheckConfigRequest,com.google.monitoring.v3.UptimeCheckConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UptimeCheckServiceStub this]
    (-> this (.updateUptimeCheckConfigCallable))))

(defn list-uptime-check-configs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListUptimeCheckConfigsRequest,com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^UptimeCheckServiceStub this]
    (-> this (.listUptimeCheckConfigsPagedCallable))))

