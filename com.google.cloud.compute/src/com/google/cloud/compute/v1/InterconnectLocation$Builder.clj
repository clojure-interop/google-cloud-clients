(ns com.google.cloud.compute.v1.InterconnectLocation$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectLocation$Builder]))

(defn set-description
  "[Output Only] An optional description of the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^InterconnectLocation$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-city
  "[Output Only] Metropolitan area designator that indicates which city an interconnect is
   located. For example: \"Chicago, IL\", \"Amsterdam, Netherlands\".

  city - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^InterconnectLocation$Builder this ^java.lang.String city]
    (-> this (.setCity city))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^InterconnectLocation$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-availability-zone
  "[Output Only] Availability zone for this InterconnectLocation. Within a metropolitan area
   (metro), maintenance will not be simultaneously scheduled in more than one availability zone.
   Example: \"zone1\" or \"zone2\".

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation$Builder this]
    (-> this (.getAvailabilityZone))))

(defn get-continent
  "[Output Only] Continent for this location, which can take one of the following values: -
   AFRICA - ASIA_PAC - EUROPE - NORTH_AMERICA - SOUTH_AMERICA

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation$Builder this]
    (-> this (.getContinent))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#interconnectLocation for interconnect
   locations.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation$Builder this]
    (-> this (.getKind))))

(defn get-status
  "[Output Only] The status of this InterconnectLocation, which can take one of the following
   values: - CLOSED: The InterconnectLocation is closed and is unavailable for provisioning new
   Interconnects. - AVAILABLE: The InterconnectLocation is available for provisioning new
   Interconnects.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation$Builder this]
    (-> this (.getStatus))))

(defn set-availability-zone
  "[Output Only] Availability zone for this InterconnectLocation. Within a metropolitan area
   (metro), maintenance will not be simultaneously scheduled in more than one availability zone.
   Example: \"zone1\" or \"zone2\".

  availability-zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^InterconnectLocation$Builder this ^java.lang.String availability-zone]
    (-> this (.setAvailabilityZone availability-zone))))

(defn set-name
  "[Output Only] Name of the resource.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^InterconnectLocation$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn get-region-infos-list
  "[Output Only] A list of InterconnectLocation.RegionInfo objects, that describe parameters
   pertaining to the relation between this InterconnectLocation and various Google Cloud
   regions.

  returns: `java.util.List<com.google.cloud.compute.v1.InterconnectLocationRegionInfo>`"
  (^java.util.List [^InterconnectLocation$Builder this]
    (-> this (.getRegionInfosList))))

(defn get-address
  "[Output Only] The postal address of the Point of Presence, each line in the address is
   separated by a newline character.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation$Builder this]
    (-> this (.getAddress))))

(defn get-facility-provider-facility-id
  "[Output Only] A provider-assigned Identifier for this facility (e.g., Ashburn-DC1).

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation$Builder this]
    (-> this (.getFacilityProviderFacilityId))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#interconnectLocation for interconnect
   locations.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^InterconnectLocation$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-facility-provider
  "[Output Only] The name of the provider for this facility (e.g., EQUINIX).

  facility-provider - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^InterconnectLocation$Builder this ^java.lang.String facility-provider]
    (-> this (.setFacilityProvider facility-provider))))

(defn set-address
  "[Output Only] The postal address of the Point of Presence, each line in the address is
   separated by a newline character.

  address - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^InterconnectLocation$Builder this ^java.lang.String address]
    (-> this (.setAddress address))))

(defn get-name
  "[Output Only] Name of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^InterconnectLocation$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn add-region-infos
  "[Output Only] A list of InterconnectLocation.RegionInfo objects, that describe parameters
   pertaining to the relation between this InterconnectLocation and various Google Cloud
   regions.

  region-infos - `com.google.cloud.compute.v1.InterconnectLocationRegionInfo`

  returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^InterconnectLocation$Builder this ^com.google.cloud.compute.v1.InterconnectLocationRegionInfo region-infos]
    (-> this (.addRegionInfos region-infos))))

(defn get-peeringdb-facility-id
  "[Output Only] The peeringdb identifier for this facility (corresponding with a netfac type in
   peeringdb).

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation$Builder this]
    (-> this (.getPeeringdbFacilityId))))

(defn build
  "returns: `com.google.cloud.compute.v1.InterconnectLocation`"
  (^com.google.cloud.compute.v1.InterconnectLocation [^InterconnectLocation$Builder this]
    (-> this (.build))))

(defn get-description
  "[Output Only] An optional description of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^InterconnectLocation$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InterconnectLocation`

  returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^InterconnectLocation$Builder this ^com.google.cloud.compute.v1.InterconnectLocation other]
    (-> this (.mergeFrom other))))

(defn set-facility-provider-facility-id
  "[Output Only] A provider-assigned Identifier for this facility (e.g., Ashburn-DC1).

  facility-provider-facility-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^InterconnectLocation$Builder this ^java.lang.String facility-provider-facility-id]
    (-> this (.setFacilityProviderFacilityId facility-provider-facility-id))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation$Builder this]
    (-> this (.getSelfLink))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^InterconnectLocation$Builder this]
    (-> this (.clone))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation$Builder this]
    (-> this (.getCreationTimestamp))))

(defn get-facility-provider
  "[Output Only] The name of the provider for this facility (e.g., EQUINIX).

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation$Builder this]
    (-> this (.getFacilityProvider))))

(defn get-city
  "[Output Only] Metropolitan area designator that indicates which city an interconnect is
   located. For example: \"Chicago, IL\", \"Amsterdam, Netherlands\".

  returns: `java.lang.String`"
  (^java.lang.String [^InterconnectLocation$Builder this]
    (-> this (.getCity))))

(defn add-all-region-infos
  "[Output Only] A list of InterconnectLocation.RegionInfo objects, that describe parameters
   pertaining to the relation between this InterconnectLocation and various Google Cloud
   regions.

  region-infos - `java.util.List`

  returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^InterconnectLocation$Builder this ^java.util.List region-infos]
    (-> this (.addAllRegionInfos region-infos))))

(defn set-continent
  "[Output Only] Continent for this location, which can take one of the following values: -
   AFRICA - ASIA_PAC - EUROPE - NORTH_AMERICA - SOUTH_AMERICA

  continent - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^InterconnectLocation$Builder this ^java.lang.String continent]
    (-> this (.setContinent continent))))

(defn set-peeringdb-facility-id
  "[Output Only] The peeringdb identifier for this facility (corresponding with a netfac type in
   peeringdb).

  peeringdb-facility-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^InterconnectLocation$Builder this ^java.lang.String peeringdb-facility-id]
    (-> this (.setPeeringdbFacilityId peeringdb-facility-id))))

(defn set-status
  "[Output Only] The status of this InterconnectLocation, which can take one of the following
   values: - CLOSED: The InterconnectLocation is closed and is unavailable for provisioning new
   Interconnects. - AVAILABLE: The InterconnectLocation is available for provisioning new
   Interconnects.

  status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InterconnectLocation$Builder`"
  (^com.google.cloud.compute.v1.InterconnectLocation$Builder [^InterconnectLocation$Builder this ^java.lang.String status]
    (-> this (.setStatus status))))

