(ns com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectsGetDiagnosticsResponse$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse`

  returns: `com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse$Builder`"
  (^com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse$Builder [^InterconnectsGetDiagnosticsResponse$Builder this ^com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse other]
    (-> this (.mergeFrom other))))

(defn get-result
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnostics`"
  (^com.google.cloud.compute.v1.InterconnectDiagnostics [^InterconnectsGetDiagnosticsResponse$Builder this]
    (-> this (.getResult))))

(defn set-result
  "result - `com.google.cloud.compute.v1.InterconnectDiagnostics`

  returns: `com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse$Builder`"
  (^com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse$Builder [^InterconnectsGetDiagnosticsResponse$Builder this ^com.google.cloud.compute.v1.InterconnectDiagnostics result]
    (-> this (.setResult result))))

(defn build
  "returns: `com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse`"
  (^com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse [^InterconnectsGetDiagnosticsResponse$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse$Builder`"
  (^com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse$Builder [^InterconnectsGetDiagnosticsResponse$Builder this]
    (-> this (.clone))))

