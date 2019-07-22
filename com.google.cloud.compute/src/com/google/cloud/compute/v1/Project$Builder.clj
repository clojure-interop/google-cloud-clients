(ns com.google.cloud.compute.v1.Project$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Project$Builder]))

(defn set-description
  "An optional textual description of the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Project$Builder`"
  (^com.google.cloud.compute.v1.Project$Builder [^Project$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn get-xpn-project-status
  "[Output Only] The role this project has in a shared VPC configuration. Currently only HOST
   projects are differentiated.

  returns: `java.lang.String`"
  (^java.lang.String [^Project$Builder this]
    (-> this (.getXpnProjectStatus))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Project$Builder`"
  (^com.google.cloud.compute.v1.Project$Builder [^Project$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-default-network-tier
  "This signifies the default network tier used for configuring resources of the project and can
   only take the following values: PREMIUM, STANDARD. Initially the default network tier is
   PREMIUM.

  returns: `java.lang.String`"
  (^java.lang.String [^Project$Builder this]
    (-> this (.getDefaultNetworkTier))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#project for projects.

  returns: `java.lang.String`"
  (^java.lang.String [^Project$Builder this]
    (-> this (.getKind))))

(defn add-all-enabled-features
  "Restricted features enabled for use on this project.

  enabled-features - `java.util.List`

  returns: `com.google.cloud.compute.v1.Project$Builder`"
  (^com.google.cloud.compute.v1.Project$Builder [^Project$Builder this ^java.util.List enabled-features]
    (-> this (.addAllEnabledFeatures enabled-features))))

(defn add-all-quotas
  "[Output Only] Quotas assigned to this project.

  quotas - `java.util.List`

  returns: `com.google.cloud.compute.v1.Project$Builder`"
  (^com.google.cloud.compute.v1.Project$Builder [^Project$Builder this ^java.util.List quotas]
    (-> this (.addAllQuotas quotas))))

(defn set-name
  "The project ID. For example: my-example-project. Use the project ID to make requests to
   Compute Engine.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Project$Builder`"
  (^com.google.cloud.compute.v1.Project$Builder [^Project$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-usage-export-location
  "The naming prefix for daily usage reports and the Google Cloud Storage bucket where they are
   stored.

  usage-export-location - `com.google.cloud.compute.v1.UsageExportLocation`

  returns: `com.google.cloud.compute.v1.Project$Builder`"
  (^com.google.cloud.compute.v1.Project$Builder [^Project$Builder this ^com.google.cloud.compute.v1.UsageExportLocation usage-export-location]
    (-> this (.setUsageExportLocation usage-export-location))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#project for projects.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Project$Builder`"
  (^com.google.cloud.compute.v1.Project$Builder [^Project$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn add-enabled-features
  "Restricted features enabled for use on this project.

  enabled-features - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Project$Builder`"
  (^com.google.cloud.compute.v1.Project$Builder [^Project$Builder this ^java.lang.String enabled-features]
    (-> this (.addEnabledFeatures enabled-features))))

(defn get-common-instance-metadata
  "Metadata key/value pairs available to all instances contained in this project. See Custom
   metadata for more information.

  returns: `com.google.cloud.compute.v1.Metadata`"
  (^com.google.cloud.compute.v1.Metadata [^Project$Builder this]
    (-> this (.getCommonInstanceMetadata))))

(defn get-name
  "The project ID. For example: my-example-project. Use the project ID to make requests to
   Compute Engine.

  returns: `java.lang.String`"
  (^java.lang.String [^Project$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server. This is not the project ID, and is just a unique ID used by Compute Engine to
   identify resources.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Project$Builder`"
  (^com.google.cloud.compute.v1.Project$Builder [^Project$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn add-quotas
  "[Output Only] Quotas assigned to this project.

  quotas - `com.google.cloud.compute.v1.Quota`

  returns: `com.google.cloud.compute.v1.Project$Builder`"
  (^com.google.cloud.compute.v1.Project$Builder [^Project$Builder this ^com.google.cloud.compute.v1.Quota quotas]
    (-> this (.addQuotas quotas))))

(defn get-default-service-account
  "[Output Only] Default service account used by VMs running in this project.

  returns: `java.lang.String`"
  (^java.lang.String [^Project$Builder this]
    (-> this (.getDefaultServiceAccount))))

(defn build
  "returns: `com.google.cloud.compute.v1.Project`"
  (^com.google.cloud.compute.v1.Project [^Project$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional textual description of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Project$Builder this]
    (-> this (.getDescription))))

(defn get-quotas-list
  "[Output Only] Quotas assigned to this project.

  returns: `java.util.List<com.google.cloud.compute.v1.Quota>`"
  (^java.util.List [^Project$Builder this]
    (-> this (.getQuotasList))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server. This is not the project ID, and is just a unique ID used by Compute Engine to
   identify resources.

  returns: `java.lang.String`"
  (^java.lang.String [^Project$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Project$Builder`"
  (^com.google.cloud.compute.v1.Project$Builder [^Project$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn set-default-service-account
  "[Output Only] Default service account used by VMs running in this project.

  default-service-account - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Project$Builder`"
  (^com.google.cloud.compute.v1.Project$Builder [^Project$Builder this ^java.lang.String default-service-account]
    (-> this (.setDefaultServiceAccount default-service-account))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Project`

  returns: `com.google.cloud.compute.v1.Project$Builder`"
  (^com.google.cloud.compute.v1.Project$Builder [^Project$Builder this ^com.google.cloud.compute.v1.Project other]
    (-> this (.mergeFrom other))))

(defn get-enabled-features-list
  "Restricted features enabled for use on this project.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Project$Builder this]
    (-> this (.getEnabledFeaturesList))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Project$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Project$Builder`"
  (^com.google.cloud.compute.v1.Project$Builder [^Project$Builder this]
    (-> this (.clone))))

(defn set-common-instance-metadata
  "Metadata key/value pairs available to all instances contained in this project. See Custom
   metadata for more information.

  common-instance-metadata - `com.google.cloud.compute.v1.Metadata`

  returns: `com.google.cloud.compute.v1.Project$Builder`"
  (^com.google.cloud.compute.v1.Project$Builder [^Project$Builder this ^com.google.cloud.compute.v1.Metadata common-instance-metadata]
    (-> this (.setCommonInstanceMetadata common-instance-metadata))))

(defn set-default-network-tier
  "This signifies the default network tier used for configuring resources of the project and can
   only take the following values: PREMIUM, STANDARD. Initially the default network tier is
   PREMIUM.

  default-network-tier - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Project$Builder`"
  (^com.google.cloud.compute.v1.Project$Builder [^Project$Builder this ^java.lang.String default-network-tier]
    (-> this (.setDefaultNetworkTier default-network-tier))))

(defn get-usage-export-location
  "The naming prefix for daily usage reports and the Google Cloud Storage bucket where they are
   stored.

  returns: `com.google.cloud.compute.v1.UsageExportLocation`"
  (^com.google.cloud.compute.v1.UsageExportLocation [^Project$Builder this]
    (-> this (.getUsageExportLocation))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Project$Builder this]
    (-> this (.getCreationTimestamp))))

(defn set-xpn-project-status
  "[Output Only] The role this project has in a shared VPC configuration. Currently only HOST
   projects are differentiated.

  xpn-project-status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Project$Builder`"
  (^com.google.cloud.compute.v1.Project$Builder [^Project$Builder this ^java.lang.String xpn-project-status]
    (-> this (.setXpnProjectStatus xpn-project-status))))

