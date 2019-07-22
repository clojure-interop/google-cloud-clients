(ns com.google.cloud.monitoring.v3.stub.GrpcUptimeCheckServiceStub
  "gRPC stub implementation for Stackdriver Monitoring API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3.stub GrpcUptimeCheckServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.monitoring.v3.stub.GrpcUptimeCheckServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.monitoring.v3.stub.GrpcUptimeCheckServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcUptimeCheckServiceStub/create client-context callable-factory))
  (^com.google.cloud.monitoring.v3.stub.GrpcUptimeCheckServiceStub [^com.google.cloud.monitoring.v3.stub.UptimeCheckServiceStubSettings settings]
    (GrpcUptimeCheckServiceStub/create settings)))

(defn list-uptime-check-ips-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListUptimeCheckIpsRequest,com.google.monitoring.v3.ListUptimeCheckIpsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcUptimeCheckServiceStub this]
    (-> this (.listUptimeCheckIpsCallable))))

(defn list-uptime-check-ips-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListUptimeCheckIpsRequest,com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckIpsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcUptimeCheckServiceStub this]
    (-> this (.listUptimeCheckIpsPagedCallable))))

(defn list-uptime-check-configs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListUptimeCheckConfigsRequest,com.google.monitoring.v3.ListUptimeCheckConfigsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcUptimeCheckServiceStub this]
    (-> this (.listUptimeCheckConfigsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcUptimeCheckServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcUptimeCheckServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcUptimeCheckServiceStub this]
    (-> this (.shutdown))))

(defn get-uptime-check-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetUptimeCheckConfigRequest,com.google.monitoring.v3.UptimeCheckConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcUptimeCheckServiceStub this]
    (-> this (.getUptimeCheckConfigCallable))))

(defn create-uptime-check-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.CreateUptimeCheckConfigRequest,com.google.monitoring.v3.UptimeCheckConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcUptimeCheckServiceStub this]
    (-> this (.createUptimeCheckConfigCallable))))

(defn delete-uptime-check-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.DeleteUptimeCheckConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcUptimeCheckServiceStub this]
    (-> this (.deleteUptimeCheckConfigCallable))))

(defn close
  ""
  ([^GrpcUptimeCheckServiceStub this]
    (-> this (.close))))

(defn update-uptime-check-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.UpdateUptimeCheckConfigRequest,com.google.monitoring.v3.UptimeCheckConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcUptimeCheckServiceStub this]
    (-> this (.updateUptimeCheckConfigCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcUptimeCheckServiceStub this]
    (-> this (.isTerminated))))

(defn list-uptime-check-configs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListUptimeCheckConfigsRequest,com.google.cloud.monitoring.v3.UptimeCheckServiceClient$ListUptimeCheckConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcUptimeCheckServiceStub this]
    (-> this (.listUptimeCheckConfigsPagedCallable))))

(defn shutdown-now
  ""
  ([^GrpcUptimeCheckServiceStub this]
    (-> this (.shutdownNow))))

