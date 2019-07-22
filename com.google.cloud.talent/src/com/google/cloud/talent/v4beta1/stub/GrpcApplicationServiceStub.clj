(ns com.google.cloud.talent.v4beta1.stub.GrpcApplicationServiceStub
  "gRPC stub implementation for Cloud Talent Solution API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1.stub GrpcApplicationServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.talent.v4beta1.stub.GrpcApplicationServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.stub.GrpcApplicationServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcApplicationServiceStub/create client-context callable-factory))
  (^com.google.cloud.talent.v4beta1.stub.GrpcApplicationServiceStub [^com.google.cloud.talent.v4beta1.stub.ApplicationServiceStubSettings settings]
    (GrpcApplicationServiceStub/create settings)))

(defn get-application-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.GetApplicationRequest,com.google.cloud.talent.v4beta1.Application>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcApplicationServiceStub this]
    (-> this (.getApplicationCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcApplicationServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcApplicationServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcApplicationServiceStub this]
    (-> this (.shutdown))))

(defn update-application-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.UpdateApplicationRequest,com.google.cloud.talent.v4beta1.Application>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcApplicationServiceStub this]
    (-> this (.updateApplicationCallable))))

(defn close
  ""
  ([^GrpcApplicationServiceStub this]
    (-> this (.close))))

(defn create-application-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CreateApplicationRequest,com.google.cloud.talent.v4beta1.Application>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcApplicationServiceStub this]
    (-> this (.createApplicationCallable))))

(defn delete-application-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.DeleteApplicationRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcApplicationServiceStub this]
    (-> this (.deleteApplicationCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcApplicationServiceStub this]
    (-> this (.isTerminated))))

(defn list-applications-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListApplicationsRequest,com.google.cloud.talent.v4beta1.ListApplicationsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcApplicationServiceStub this]
    (-> this (.listApplicationsCallable))))

(defn shutdown-now
  ""
  ([^GrpcApplicationServiceStub this]
    (-> this (.shutdownNow))))

(defn list-applications-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.ListApplicationsRequest,com.google.cloud.talent.v4beta1.ApplicationServiceClient$ListApplicationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcApplicationServiceStub this]
    (-> this (.listApplicationsPagedCallable))))

