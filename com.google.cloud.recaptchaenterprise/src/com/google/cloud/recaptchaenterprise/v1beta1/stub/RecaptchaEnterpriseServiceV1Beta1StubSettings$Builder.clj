(ns com.google.cloud.recaptchaenterprise.v1beta1.stub.RecaptchaEnterpriseServiceV1Beta1StubSettings$Builder
  "Builder for RecaptchaEnterpriseServiceV1Beta1StubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.recaptchaenterprise.v1beta1.stub RecaptchaEnterpriseServiceV1Beta1StubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.recaptchaenterprise.v1beta1.stub.RecaptchaEnterpriseServiceV1Beta1StubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.recaptchaenterprise.v1beta1.stub.RecaptchaEnterpriseServiceV1Beta1StubSettings$Builder [^RecaptchaEnterpriseServiceV1Beta1StubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^RecaptchaEnterpriseServiceV1Beta1StubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn create-assessment-settings
  "Returns the builder for the settings used for calls to createAssessment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.recaptchaenterprise.v1beta1.CreateAssessmentRequest,com.google.recaptchaenterprise.v1beta1.Assessment>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RecaptchaEnterpriseServiceV1Beta1StubSettings$Builder this]
    (-> this (.createAssessmentSettings))))

(defn annotate-assessment-settings
  "Returns the builder for the settings used for calls to annotateAssessment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest,com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RecaptchaEnterpriseServiceV1Beta1StubSettings$Builder this]
    (-> this (.annotateAssessmentSettings))))

(defn build
  "returns: `com.google.cloud.recaptchaenterprise.v1beta1.stub.RecaptchaEnterpriseServiceV1Beta1StubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.recaptchaenterprise.v1beta1.stub.RecaptchaEnterpriseServiceV1Beta1StubSettings [^RecaptchaEnterpriseServiceV1Beta1StubSettings$Builder this]
    (-> this (.build))))

