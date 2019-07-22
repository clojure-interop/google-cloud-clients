(ns com.google.cloud.recaptchaenterprise.v1beta1.stub.RecaptchaEnterpriseServiceV1Beta1Stub
  "Base stub class for reCAPTCHA Enterprise API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.recaptchaenterprise.v1beta1.stub RecaptchaEnterpriseServiceV1Beta1Stub]))

(defn ->recaptcha-enterprise-service-v-1-beta-1-stub
  "Constructor."
  (^RecaptchaEnterpriseServiceV1Beta1Stub []
    (new RecaptchaEnterpriseServiceV1Beta1Stub )))

(defn create-assessment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.recaptchaenterprise.v1beta1.CreateAssessmentRequest,com.google.recaptchaenterprise.v1beta1.Assessment>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RecaptchaEnterpriseServiceV1Beta1Stub this]
    (-> this (.createAssessmentCallable))))

(defn annotate-assessment-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest,com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RecaptchaEnterpriseServiceV1Beta1Stub this]
    (-> this (.annotateAssessmentCallable))))

(defn close
  ""
  ([^RecaptchaEnterpriseServiceV1Beta1Stub this]
    (-> this (.close))))

