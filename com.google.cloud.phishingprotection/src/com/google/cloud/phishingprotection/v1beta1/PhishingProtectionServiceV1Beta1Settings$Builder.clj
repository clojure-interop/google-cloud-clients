(ns com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Settings$Builder
  "Builder for PhishingProtectionServiceV1Beta1Settings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.phishingprotection.v1beta1 PhishingProtectionServiceV1Beta1Settings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1StubSettings$Builder`"
  (^com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1StubSettings$Builder [^PhishingProtectionServiceV1Beta1Settings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Settings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Settings$Builder [^PhishingProtectionServiceV1Beta1Settings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn report-phishing-settings
  "Returns the builder for the settings used for calls to reportPhishing.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.phishingprotection.v1beta1.ReportPhishingRequest,com.google.phishingprotection.v1beta1.ReportPhishingResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^PhishingProtectionServiceV1Beta1Settings$Builder this]
    (-> this (.reportPhishingSettings))))

(defn build
  "returns: `com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Settings`

  throws: java.io.IOException"
  (^com.google.cloud.phishingprotection.v1beta1.PhishingProtectionServiceV1Beta1Settings [^PhishingProtectionServiceV1Beta1Settings$Builder this]
    (-> this (.build))))

