(ns com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1StubSettings$Builder
  "Builder for PhishingProtectionServiceV1Beta1StubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.phishingprotection.v1beta1.stub PhishingProtectionServiceV1Beta1StubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1StubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1StubSettings$Builder [^PhishingProtectionServiceV1Beta1StubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^PhishingProtectionServiceV1Beta1StubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn report-phishing-settings
  "Returns the builder for the settings used for calls to reportPhishing.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.phishingprotection.v1beta1.ReportPhishingRequest,com.google.phishingprotection.v1beta1.ReportPhishingResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^PhishingProtectionServiceV1Beta1StubSettings$Builder this]
    (-> this (.reportPhishingSettings))))

(defn build
  "returns: `com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1StubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1StubSettings [^PhishingProtectionServiceV1Beta1StubSettings$Builder this]
    (-> this (.build))))

