(ns com.google.cloud.phishingprotection.v1beta1.stub.GrpcPhishingProtectionServiceV1Beta1Stub
  "gRPC stub implementation for Phishing Protection API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.phishingprotection.v1beta1.stub GrpcPhishingProtectionServiceV1Beta1Stub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.phishingprotection.v1beta1.stub.GrpcPhishingProtectionServiceV1Beta1Stub`

  throws: java.io.IOException"
  (^com.google.cloud.phishingprotection.v1beta1.stub.GrpcPhishingProtectionServiceV1Beta1Stub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcPhishingProtectionServiceV1Beta1Stub/create client-context callable-factory))
  (^com.google.cloud.phishingprotection.v1beta1.stub.GrpcPhishingProtectionServiceV1Beta1Stub [^com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1StubSettings settings]
    (GrpcPhishingProtectionServiceV1Beta1Stub/create settings)))

(defn report-phishing-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.phishingprotection.v1beta1.ReportPhishingRequest,com.google.phishingprotection.v1beta1.ReportPhishingResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcPhishingProtectionServiceV1Beta1Stub this]
    (-> this (.reportPhishingCallable))))

(defn close
  ""
  ([^GrpcPhishingProtectionServiceV1Beta1Stub this]
    (-> this (.close))))

(defn shutdown
  ""
  ([^GrpcPhishingProtectionServiceV1Beta1Stub this]
    (-> this (.shutdown))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcPhishingProtectionServiceV1Beta1Stub this]
    (-> this (.isShutdown))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcPhishingProtectionServiceV1Beta1Stub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcPhishingProtectionServiceV1Beta1Stub this]
    (-> this (.shutdownNow))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcPhishingProtectionServiceV1Beta1Stub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

