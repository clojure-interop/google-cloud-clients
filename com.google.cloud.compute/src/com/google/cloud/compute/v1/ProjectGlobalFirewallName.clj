(ns com.google.cloud.compute.v1.ProjectGlobalFirewallName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalFirewallName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalFirewallName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalFirewallName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalFirewallName$Builder []
    (ProjectGlobalFirewallName/newBuilder )))

(defn *of
  "firewall - `java.lang.String`
  project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalFirewallName`"
  (^com.google.cloud.compute.v1.ProjectGlobalFirewallName [^java.lang.String firewall ^java.lang.String project]
    (ProjectGlobalFirewallName/of firewall project)))

(defn *format
  "firewall - `java.lang.String`
  project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String firewall ^java.lang.String project]
    (ProjectGlobalFirewallName/format firewall project)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalFirewallName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalFirewallName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalFirewallName`"
  (^com.google.cloud.compute.v1.ProjectGlobalFirewallName [^java.lang.String formatted-string]
    (ProjectGlobalFirewallName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalFirewallName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalFirewallName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalFirewallName$Builder [^ProjectGlobalFirewallName this]
    (-> this (.toBuilder))))

(defn get-firewall
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalFirewallName this]
    (-> this (.getFirewall))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalFirewallName this]
    (-> this (.getProject))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalFirewallName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalFirewallName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalFirewallName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalFirewallName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalFirewallName this]
    (-> this (.hashCode))))

