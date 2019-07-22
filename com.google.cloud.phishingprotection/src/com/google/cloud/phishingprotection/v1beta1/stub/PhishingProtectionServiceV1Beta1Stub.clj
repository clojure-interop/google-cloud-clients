(ns com.google.cloud.phishingprotection.v1beta1.stub.PhishingProtectionServiceV1Beta1Stub
  "Base stub class for Phishing Protection API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.phishingprotection.v1beta1.stub PhishingProtectionServiceV1Beta1Stub]))

(defn ->phishing-protection-service-v-1-beta-1-stub
  "Constructor."
  (^PhishingProtectionServiceV1Beta1Stub []
    (new PhishingProtectionServiceV1Beta1Stub )))

(defn report-phishing-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.phishingprotection.v1beta1.ReportPhishingRequest,com.google.phishingprotection.v1beta1.ReportPhishingResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^PhishingProtectionServiceV1Beta1Stub this]
    (-> this (.reportPhishingCallable))))

(defn close
  ""
  ([^PhishingProtectionServiceV1Beta1Stub this]
    (-> this (.close))))

