(ns com.google.cloud.errorreporting.v1beta1.stub.GrpcReportErrorsServiceStub
  "gRPC stub implementation for Stackdriver Error Reporting API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1.stub GrpcReportErrorsServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.errorreporting.v1beta1.stub.GrpcReportErrorsServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.errorreporting.v1beta1.stub.GrpcReportErrorsServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcReportErrorsServiceStub/create client-context callable-factory))
  (^com.google.cloud.errorreporting.v1beta1.stub.GrpcReportErrorsServiceStub [^com.google.cloud.errorreporting.v1beta1.stub.ReportErrorsServiceStubSettings settings]
    (GrpcReportErrorsServiceStub/create settings)))

(defn report-error-event-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest,com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcReportErrorsServiceStub this]
    (-> this (.reportErrorEventCallable))))

(defn close
  ""
  ([^GrpcReportErrorsServiceStub this]
    (-> this (.close))))

(defn shutdown
  ""
  ([^GrpcReportErrorsServiceStub this]
    (-> this (.shutdown))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcReportErrorsServiceStub this]
    (-> this (.isShutdown))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcReportErrorsServiceStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcReportErrorsServiceStub this]
    (-> this (.shutdownNow))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcReportErrorsServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

