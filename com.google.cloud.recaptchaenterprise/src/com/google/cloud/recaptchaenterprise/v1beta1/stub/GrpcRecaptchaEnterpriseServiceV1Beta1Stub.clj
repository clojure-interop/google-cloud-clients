(ns com.google.cloud.recaptchaenterprise.v1beta1.stub.GrpcRecaptchaEnterpriseServiceV1Beta1Stub
  "gRPC stub implementation for reCAPTCHA Enterprise API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.recaptchaenterprise.v1beta1.stub GrpcRecaptchaEnterpriseServiceV1Beta1Stub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.recaptchaenterprise.v1beta1.stub.GrpcRecaptchaEnterpriseServiceV1Beta1Stub`

  throws: java.io.IOException"
  (^com.google.cloud.recaptchaenterprise.v1beta1.stub.GrpcRecaptchaEnterpriseServiceV1Beta1Stub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcRecaptchaEnterpriseServiceV1Beta1Stub/create client-context callable-factory))
  (^com.google.cloud.recaptchaenterprise.v1beta1.stub.GrpcRecaptchaEnterpriseServiceV1Beta1Stub [^com.google.cloud.recaptchaenterprise.v1beta1.stub.RecaptchaEnterpriseServiceV1Beta1StubSettings settings]
    (GrpcRecaptchaEnterpriseServiceV1Beta1Stub/create settings)))

(defn create-assessment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.recaptchaenterprise.v1beta1.CreateAssessmentRequest,com.google.recaptchaenterprise.v1beta1.Assessment>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcRecaptchaEnterpriseServiceV1Beta1Stub this]
    (-> this (.createAssessmentCallable))))

(defn annotate-assessment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest,com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcRecaptchaEnterpriseServiceV1Beta1Stub this]
    (-> this (.annotateAssessmentCallable))))

(defn close
  ""
  ([^GrpcRecaptchaEnterpriseServiceV1Beta1Stub this]
    (-> this (.close))))

(defn shutdown
  ""
  ([^GrpcRecaptchaEnterpriseServiceV1Beta1Stub this]
    (-> this (.shutdown))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcRecaptchaEnterpriseServiceV1Beta1Stub this]
    (-> this (.isShutdown))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcRecaptchaEnterpriseServiceV1Beta1Stub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcRecaptchaEnterpriseServiceV1Beta1Stub this]
    (-> this (.shutdownNow))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcRecaptchaEnterpriseServiceV1Beta1Stub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

