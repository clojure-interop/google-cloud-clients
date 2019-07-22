(ns com.google.cloud.compute.v1.ProjectGlobalFirewallName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalFirewallName$Builder]))

(defn ->builder
  "Constructor.

  project-global-firewall-name - `com.google.cloud.compute.v1.ProjectGlobalFirewallName`"
  (^ProjectGlobalFirewallName$Builder [^com.google.cloud.compute.v1.ProjectGlobalFirewallName project-global-firewall-name]
    (new ProjectGlobalFirewallName$Builder project-global-firewall-name)))

(defn get-firewall
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalFirewallName$Builder this]
    (-> this (.getFirewall))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalFirewallName$Builder this]
    (-> this (.getProject))))

(defn set-firewall
  "firewall - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalFirewallName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalFirewallName$Builder [^ProjectGlobalFirewallName$Builder this ^java.lang.String firewall]
    (-> this (.setFirewall firewall))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalFirewallName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalFirewallName$Builder [^ProjectGlobalFirewallName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalFirewallName`"
  (^com.google.cloud.compute.v1.ProjectGlobalFirewallName [^ProjectGlobalFirewallName$Builder this]
    (-> this (.build))))

