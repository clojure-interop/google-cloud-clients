(ns com.google.cloud.compute.v1.Commitment$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Commitment$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Commitment$Builder`"
  (^com.google.cloud.compute.v1.Commitment$Builder [^Commitment$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-region
  "[Output Only] URL of the region where this commitment may be used.

  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Commitment$Builder`"
  (^com.google.cloud.compute.v1.Commitment$Builder [^Commitment$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Commitment$Builder`"
  (^com.google.cloud.compute.v1.Commitment$Builder [^Commitment$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-start-timestamp
  "[Output Only] Commitment start time in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment$Builder this]
    (-> this (.getStartTimestamp))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#commitment for commitments.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment$Builder this]
    (-> this (.getKind))))

(defn get-status
  "[Output Only] Status of the commitment with regards to eventual expiration (each commitment
   has an end date defined). One of the following values: NOT_YET_ACTIVE, ACTIVE, EXPIRED.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment$Builder this]
    (-> this (.getStatus))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Commitment$Builder`"
  (^com.google.cloud.compute.v1.Commitment$Builder [^Commitment$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn get-end-timestamp
  "[Output Only] Commitment end time in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment$Builder this]
    (-> this (.getEndTimestamp))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#commitment for commitments.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Commitment$Builder`"
  (^com.google.cloud.compute.v1.Commitment$Builder [^Commitment$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Commitment$Builder`"
  (^com.google.cloud.compute.v1.Commitment$Builder [^Commitment$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-plan
  "The plan for this commitment, which determines duration and discount rate. The currently
   supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment$Builder this]
    (-> this (.getPlan))))

(defn build
  "returns: `com.google.cloud.compute.v1.Commitment`"
  (^com.google.cloud.compute.v1.Commitment [^Commitment$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment$Builder this]
    (-> this (.getDescription))))

(defn set-plan
  "The plan for this commitment, which determines duration and discount rate. The currently
   supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).

  plan - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Commitment$Builder`"
  (^com.google.cloud.compute.v1.Commitment$Builder [^Commitment$Builder this ^java.lang.String plan]
    (-> this (.setPlan plan))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Commitment$Builder`"
  (^com.google.cloud.compute.v1.Commitment$Builder [^Commitment$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn set-start-timestamp
  "[Output Only] Commitment start time in RFC3339 text format.

  start-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Commitment$Builder`"
  (^com.google.cloud.compute.v1.Commitment$Builder [^Commitment$Builder this ^java.lang.String start-timestamp]
    (-> this (.setStartTimestamp start-timestamp))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Commitment`

  returns: `com.google.cloud.compute.v1.Commitment$Builder`"
  (^com.google.cloud.compute.v1.Commitment$Builder [^Commitment$Builder this ^com.google.cloud.compute.v1.Commitment other]
    (-> this (.mergeFrom other))))

(defn add-resources
  "A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource
   commitments must occur together.

  resources - `com.google.cloud.compute.v1.ResourceCommitment`

  returns: `com.google.cloud.compute.v1.Commitment$Builder`"
  (^com.google.cloud.compute.v1.Commitment$Builder [^Commitment$Builder this ^com.google.cloud.compute.v1.ResourceCommitment resources]
    (-> this (.addResources resources))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment$Builder this]
    (-> this (.getSelfLink))))

(defn get-resources-list
  "A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource
   commitments must occur together.

  returns: `java.util.List<com.google.cloud.compute.v1.ResourceCommitment>`"
  (^java.util.List [^Commitment$Builder this]
    (-> this (.getResourcesList))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Commitment$Builder`"
  (^com.google.cloud.compute.v1.Commitment$Builder [^Commitment$Builder this]
    (-> this (.clone))))

(defn set-end-timestamp
  "[Output Only] Commitment end time in RFC3339 text format.

  end-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Commitment$Builder`"
  (^com.google.cloud.compute.v1.Commitment$Builder [^Commitment$Builder this ^java.lang.String end-timestamp]
    (-> this (.setEndTimestamp end-timestamp))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment$Builder this]
    (-> this (.getCreationTimestamp))))

(defn get-status-message
  "[Output Only] An optional, human-readable explanation of the status.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment$Builder this]
    (-> this (.getStatusMessage))))

(defn set-status
  "[Output Only] Status of the commitment with regards to eventual expiration (each commitment
   has an end date defined). One of the following values: NOT_YET_ACTIVE, ACTIVE, EXPIRED.

  status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Commitment$Builder`"
  (^com.google.cloud.compute.v1.Commitment$Builder [^Commitment$Builder this ^java.lang.String status]
    (-> this (.setStatus status))))

(defn set-status-message
  "[Output Only] An optional, human-readable explanation of the status.

  status-message - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Commitment$Builder`"
  (^com.google.cloud.compute.v1.Commitment$Builder [^Commitment$Builder this ^java.lang.String status-message]
    (-> this (.setStatusMessage status-message))))

(defn add-all-resources
  "A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource
   commitments must occur together.

  resources - `java.util.List`

  returns: `com.google.cloud.compute.v1.Commitment$Builder`"
  (^com.google.cloud.compute.v1.Commitment$Builder [^Commitment$Builder this ^java.util.List resources]
    (-> this (.addAllResources resources))))

(defn get-region
  "[Output Only] URL of the region where this commitment may be used.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment$Builder this]
    (-> this (.getRegion))))

