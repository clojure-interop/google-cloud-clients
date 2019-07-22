(ns com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectDiagnosticsLinkOpticalPower$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower$Builder [^InterconnectDiagnosticsLinkOpticalPower$Builder this ^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower other]
    (-> this (.mergeFrom other))))

(defn get-state
  "The status of the current value when compared to the warning and alarm levels for the
   receiving or transmitting transceiver. Possible states include: - OK: The value has not
   crossed a warning threshold. - LOW_WARNING: The value has crossed below the low warning
   threshold. - HIGH_WARNING: The value has crossed above the high warning threshold. -
   LOW_ALARM: The value has crossed below the low alarm threshold. - HIGH_ALARM: The value has
   crossed above the high alarm threshold.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectDiagnosticsLinkOpticalPower$Builder this]
    (-> this (.getState))))

(defn set-state
  "The status of the current value when compared to the warning and alarm levels for the
   receiving or transmitting transceiver. Possible states include: - OK: The value has not
   crossed a warning threshold. - LOW_WARNING: The value has crossed below the low warning
   threshold. - HIGH_WARNING: The value has crossed above the high warning threshold. -
   LOW_ALARM: The value has crossed below the low alarm threshold. - HIGH_ALARM: The value has
   crossed above the high alarm threshold.

  state - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower$Builder [^InterconnectDiagnosticsLinkOpticalPower$Builder this ^java.lang.String state]
    (-> this (.setState state))))

(defn get-value
  "Value of the current receiving or transmitting optical power, read in dBm. Take a known good
   optical value, give it a 10% margin and trigger warnings relative to that value. In general,
   a -7dBm warning and a -11dBm alarm are good optical value estimates for most links.

  returns: `java.lang.Float`"
  (^java.lang.Float [^InterconnectDiagnosticsLinkOpticalPower$Builder this]
    (-> this (.getValue))))

(defn set-value
  "Value of the current receiving or transmitting optical power, read in dBm. Take a known good
   optical value, give it a 10% margin and trigger warnings relative to that value. In general,
   a -7dBm warning and a -11dBm alarm are good optical value estimates for most links.

  value - `java.lang.Float`

  returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower$Builder [^InterconnectDiagnosticsLinkOpticalPower$Builder this ^java.lang.Float value]
    (-> this (.setValue value))))

(defn build
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower [^InterconnectDiagnosticsLinkOpticalPower$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower$Builder`"
  (^com.google.cloud.compute.v1.InterconnectDiagnosticsLinkOpticalPower$Builder [^InterconnectDiagnosticsLinkOpticalPower$Builder this]
    (-> this (.clone))))

