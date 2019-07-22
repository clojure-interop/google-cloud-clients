(ns com.google.cloud.datacatalog.v1beta1.DataCatalogClient
  "Service Description: Data Catalog API service allows clients to discover, understand, and manage
  their data.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
    Entry entry = Entry.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();
    Entry response = dataCatalogClient.updateEntry(entry, updateMask);
  }

  Note: close() needs to be called on the dataCatalogClient object to clean up resources such as
  threads. In the example above, try-with-resources is used, which automatically calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of DataCatalogSettings to
  create(). For example:

  To customize credentials:



  DataCatalogSettings dataCatalogSettings =
      DataCatalogSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  DataCatalogClient dataCatalogClient =
      DataCatalogClient.create(dataCatalogSettings);

  To customize the endpoint:



  DataCatalogSettings dataCatalogSettings =
      DataCatalogSettings.newBuilder().setEndpoint(myEndpoint).build();
  DataCatalogClient dataCatalogClient =
      DataCatalogClient.create(dataCatalogSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datacatalog.v1beta1 DataCatalogClient]))

(defn *parse-project-from-field-name
  "Deprecated. Use the FieldName class instead.

  field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String field-name]
    (DataCatalogClient/parseProjectFromFieldName field-name)))

(defn *parse-location-from-field-name
  "Deprecated. Use the FieldName class instead.

  field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String field-name]
    (DataCatalogClient/parseLocationFromFieldName field-name)))

(defn *parse-tag-from-tag-name
  "Deprecated. Use the TagName class instead.

  tag-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String tag-name]
    (DataCatalogClient/parseTagFromTagName tag-name)))

(defn *parse-project-from-entry-name
  "Deprecated. Use the EntryName class instead.

  entry-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String entry-name]
    (DataCatalogClient/parseProjectFromEntryName entry-name)))

(defn *parse-field-from-field-name
  "Deprecated. Use the FieldName class instead.

  field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String field-name]
    (DataCatalogClient/parseFieldFromFieldName field-name)))

(defn *parse-project-from-tag-template-name
  "Deprecated. Use the TagTemplateName class instead.

  tag-template-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String tag-template-name]
    (DataCatalogClient/parseProjectFromTagTemplateName tag-template-name)))

(defn *parse-project-from-tag-name
  "Deprecated. Use the TagName class instead.

  tag-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String tag-name]
    (DataCatalogClient/parseProjectFromTagName tag-name)))

(defn *format-tag-name
  "Deprecated. Use the TagName class instead.

  project - `java.lang.String`
  location - `java.lang.String`
  entry-group - `java.lang.String`
  entry - `java.lang.String`
  tag - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String location ^java.lang.String entry-group ^java.lang.String entry ^java.lang.String tag]
    (DataCatalogClient/formatTagName project location entry-group entry tag)))

(defn *format-tag-template-name
  "Deprecated. Use the TagTemplateName class instead.

  project - `java.lang.String`
  location - `java.lang.String`
  tag-template - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String location ^java.lang.String tag-template]
    (DataCatalogClient/formatTagTemplateName project location tag-template)))

(defn *parse-entry-group-from-tag-name
  "Deprecated. Use the TagName class instead.

  tag-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String tag-name]
    (DataCatalogClient/parseEntryGroupFromTagName tag-name)))

(defn *parse-entry-group-from-entry-name
  "Deprecated. Use the EntryName class instead.

  entry-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String entry-name]
    (DataCatalogClient/parseEntryGroupFromEntryName entry-name)))

(defn *format-entry-name
  "Deprecated. Use the EntryName class instead.

  project - `java.lang.String`
  location - `java.lang.String`
  entry-group - `java.lang.String`
  entry - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String location ^java.lang.String entry-group ^java.lang.String entry]
    (DataCatalogClient/formatEntryName project location entry-group entry)))

(defn *format-field-name
  "Deprecated. Use the FieldName class instead.

  project - `java.lang.String`
  location - `java.lang.String`
  tag-template - `java.lang.String`
  field - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String location ^java.lang.String tag-template ^java.lang.String field]
    (DataCatalogClient/formatFieldName project location tag-template field)))

(defn *parse-tag-template-from-tag-template-name
  "Deprecated. Use the TagTemplateName class instead.

  tag-template-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String tag-template-name]
    (DataCatalogClient/parseTagTemplateFromTagTemplateName tag-template-name)))

(defn *parse-entry-from-tag-name
  "Deprecated. Use the TagName class instead.

  tag-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String tag-name]
    (DataCatalogClient/parseEntryFromTagName tag-name)))

(defn *create
  "Constructs an instance of DataCatalogClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.datacatalog.v1beta1.DataCatalogSettings`

  returns: `com.google.cloud.datacatalog.v1beta1.DataCatalogClient`

  throws: java.io.IOException"
  (^com.google.cloud.datacatalog.v1beta1.DataCatalogClient [^com.google.cloud.datacatalog.v1beta1.DataCatalogSettings settings]
    (DataCatalogClient/create settings))
  (^com.google.cloud.datacatalog.v1beta1.DataCatalogClient []
    (DataCatalogClient/create )))

(defn *parse-entry-from-entry-name
  "Deprecated. Use the EntryName class instead.

  entry-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String entry-name]
    (DataCatalogClient/parseEntryFromEntryName entry-name)))

(defn *parse-location-from-entry-name
  "Deprecated. Use the EntryName class instead.

  entry-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String entry-name]
    (DataCatalogClient/parseLocationFromEntryName entry-name)))

(defn *format-location-name
  "Deprecated. Use the LocationName class instead.

  project - `java.lang.String`
  location - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String location]
    (DataCatalogClient/formatLocationName project location)))

(defn *parse-project-from-location-name
  "Deprecated. Use the LocationName class instead.

  location-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String location-name]
    (DataCatalogClient/parseProjectFromLocationName location-name)))

(defn *parse-location-from-tag-template-name
  "Deprecated. Use the TagTemplateName class instead.

  tag-template-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String tag-template-name]
    (DataCatalogClient/parseLocationFromTagTemplateName tag-template-name)))

(defn *parse-location-from-location-name
  "Deprecated. Use the LocationName class instead.

  location-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String location-name]
    (DataCatalogClient/parseLocationFromLocationName location-name)))

(defn *parse-location-from-tag-name
  "Deprecated. Use the TagName class instead.

  tag-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String tag-name]
    (DataCatalogClient/parseLocationFromTagName tag-name)))

(defn *parse-tag-template-from-field-name
  "Deprecated. Use the FieldName class instead.

  field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String field-name]
    (DataCatalogClient/parseTagTemplateFromFieldName field-name)))

(defn delete-tag-callable
  "Deletes a tag.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedName = DataCatalogClient.formatTagName(\"[PROJECT]\", \"[LOCATION]\", \"[ENTRY_GROUP]\", \"[ENTRY]\", \"[TAG]\");
     DeleteTagRequest request = DeleteTagRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Void> future = dataCatalogClient.deleteTagCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.DeleteTagRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.deleteTagCallable))))

(defn get-iam-policy-callable
  "Gets the access control policy for a resource. A `NOT_FOUND` error is returned if the resource
   does not exist. An empty policy is returned if the resource exists but does not have a policy
   set on it.

   Supported resources are: - Tag templates. Note, this method cannot be used to manage
   policies for BigQuery, Cloud Pub/Sub and any external Google Cloud Platform resources synced to
   Cloud Data Catalog.

   Callers must have following Google IAM permission `datacatalog.tagTemplates.getIamPolicy` to
   get policies on tag templates.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedResource = DataCatalogClient.formatTagTemplateName(\"[PROJECT]\", \"[LOCATION]\", \"[TAG_TEMPLATE]\");
     GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder()
       .setResource(formattedResource)
       .build();
     ApiFuture<Policy> future = dataCatalogClient.getIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.getIamPolicyCallable))))

(defn set-iam-policy
  "Sets the access control policy for a resource. Replaces any existing policy. Supported
   resources are: - Tag templates. Note, this method cannot be used to manage policies for
   BigQuery, Cloud Pub/Sub and any external Google Cloud Platform resources synced to Cloud Data
   Catalog.

   Callers must have following Google IAM permission `datacatalog.tagTemplates.setIamPolicy` to
   set policies on tag templates.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedResource = DataCatalogClient.formatTagTemplateName(\"[PROJECT]\", \"[LOCATION]\", \"[TAG_TEMPLATE]\");
     Policy policy = Policy.newBuilder().build();
     Policy response = dataCatalogClient.setIamPolicy(formattedResource, policy);
   }

  resource - REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field. - `java.lang.String`
  policy - REQUIRED: The complete policy to be applied to the `resource`. The size of the policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Cloud Platform services (such as Projects) might reject them. - `com.google.iam.v1.Policy`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^DataCatalogClient this ^java.lang.String resource ^com.google.iam.v1.Policy policy]
    (-> this (.setIamPolicy resource policy)))
  (^com.google.iam.v1.Policy [^DataCatalogClient this ^com.google.iam.v1.SetIamPolicyRequest request]
    (-> this (.setIamPolicy request))))

(defn search-catalog-paged-callable
  "Searches Data Catalog for multiple resources like entries, tags that match a query.

   This is a custom method (https://cloud.google.com/apis/design/custom_methods) and does not
   return the complete resource, only the resource identifier and high level fields. Clients can
   subsequentally call Get methods.

   Note that searches do not have full recall. There may be results that match your query but
   are not returned, even in subsequent pages of results. These missing results may vary across
   repeated calls to search. Do not rely on this method if you need to guarantee full recall.

   See [Data Catalog Search Syntax](/data-catalog/docs/how-to/search-reference) for more
   information.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     SearchCatalogRequest.Scope scope = SearchCatalogRequest.Scope.newBuilder().build();
     String query = \"\";
     SearchCatalogRequest request = SearchCatalogRequest.newBuilder()
       .setScope(scope)
       .setQuery(query)
       .build();
     ApiFuture<SearchCatalogPagedResponse> future = dataCatalogClient.searchCatalogPagedCallable().futureCall(request);
     // Do something
     for (SearchCatalogResult element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.SearchCatalogRequest,com.google.cloud.datacatalog.v1beta1.DataCatalogClient$SearchCatalogPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.searchCatalogPagedCallable))))

(defn list-tags
  "Lists the tags on an [Entry][google.cloud.datacatalog.v1beta1.Entry].

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedParent = DataCatalogClient.formatEntryName(\"[PROJECT]\", \"[LOCATION]\", \"[ENTRY_GROUP]\", \"[ENTRY]\");
     for (Tag element : dataCatalogClient.listTags(formattedParent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The name of the Data Catalog resource to list the tags of. The resource could be an [Entry][google.cloud.datacatalog.v1beta1.Entry]. - `java.lang.String`

  returns: `com.google.cloud.datacatalog.v1beta1.DataCatalogClient$ListTagsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datacatalog.v1beta1.DataCatalogClient$ListTagsPagedResponse [^DataCatalogClient this ^java.lang.String parent]
    (-> this (.listTags parent))))

(defn lookup-entry-callable
  "Get an entry by target resource name. This method allows clients to use the resource name from
   the source Google Cloud Platform service to get the Data Catalog Entry.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     LookupEntryRequest request = LookupEntryRequest.newBuilder().build();
     ApiFuture<Entry> future = dataCatalogClient.lookupEntryCallable().futureCall(request);
     // Do something
     Entry response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.LookupEntryRequest,com.google.cloud.datacatalog.Entry>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.lookupEntryCallable))))

(defn get-settings
  "returns: `com.google.cloud.datacatalog.v1beta1.DataCatalogSettings`"
  (^com.google.cloud.datacatalog.v1beta1.DataCatalogSettings [^DataCatalogClient this]
    (-> this (.getSettings))))

(defn get-entry
  "Gets an entry.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedName = DataCatalogClient.formatEntryName(\"[PROJECT]\", \"[LOCATION]\", \"[ENTRY_GROUP]\", \"[ENTRY]\");
     Entry response = dataCatalogClient.getEntry(formattedName);
   }

  name - Required. The name of the entry. For example, \"projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id}\". - `java.lang.String`

  returns: `com.google.cloud.datacatalog.Entry`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datacatalog.Entry [^DataCatalogClient this ^java.lang.String name]
    (-> this (.getEntry name))))

(defn delete-tag-template
  "Deletes a tag template and all tags using the template.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedName = DataCatalogClient.formatTagTemplateName(\"[PROJECT]\", \"[LOCATION]\", \"[TAG_TEMPLATE]\");
     boolean force = false;
     dataCatalogClient.deleteTagTemplate(formattedName, force);
   }

  name - Required. The name of the tag template to delete. For example, \"projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}\". - `java.lang.String`
  force - Required. Currently, this field must always be set to <code>true</code>. This confirms the deletion of any possible tags using this template. <code>force = false</code> will be supported in the future. - `boolean`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DataCatalogClient this ^java.lang.String name ^Boolean force]
    (-> this (.deleteTagTemplate name force)))
  ([^DataCatalogClient this ^com.google.cloud.datacatalog.DeleteTagTemplateRequest request]
    (-> this (.deleteTagTemplate request))))

(defn create-tag-template-callable
  "Creates a tag template.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedParent = DataCatalogClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     String tagTemplateId = \"\";
     TagTemplate tagTemplate = TagTemplate.newBuilder().build();
     CreateTagTemplateRequest request = CreateTagTemplateRequest.newBuilder()
       .setParent(formattedParent)
       .setTagTemplateId(tagTemplateId)
       .setTagTemplate(tagTemplate)
       .build();
     ApiFuture<TagTemplate> future = dataCatalogClient.createTagTemplateCallable().futureCall(request);
     // Do something
     TagTemplate response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.CreateTagTemplateRequest,com.google.cloud.datacatalog.TagTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.createTagTemplateCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStub`"
  ([^DataCatalogClient this]
    (-> this (.getStub))))

(defn create-tag-template
  "Creates a tag template.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedParent = DataCatalogClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     String tagTemplateId = \"\";
     TagTemplate tagTemplate = TagTemplate.newBuilder().build();
     TagTemplate response = dataCatalogClient.createTagTemplate(formattedParent, tagTemplateId, tagTemplate);
   }

  parent - Required. The name of the project and the location this template is in. Example: \"projects/{project_id}/locations/{location}\". Note that this TagTemplate and its child resources may not actually be stored in the location in this name. - `java.lang.String`
  tag-template-id - Required. The id of the tag template to create. - `java.lang.String`
  tag-template - Required. The tag template to create. - `com.google.cloud.datacatalog.TagTemplate`

  returns: `com.google.cloud.datacatalog.TagTemplate`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datacatalog.TagTemplate [^DataCatalogClient this ^java.lang.String parent ^java.lang.String tag-template-id ^com.google.cloud.datacatalog.TagTemplate tag-template]
    (-> this (.createTagTemplate parent tag-template-id tag-template)))
  (^com.google.cloud.datacatalog.TagTemplate [^DataCatalogClient this ^com.google.cloud.datacatalog.CreateTagTemplateRequest request]
    (-> this (.createTagTemplate request))))

(defn get-entry-callable
  "Gets an entry.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedName = DataCatalogClient.formatEntryName(\"[PROJECT]\", \"[LOCATION]\", \"[ENTRY_GROUP]\", \"[ENTRY]\");
     GetEntryRequest request = GetEntryRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Entry> future = dataCatalogClient.getEntryCallable().futureCall(request);
     // Do something
     Entry response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.GetEntryRequest,com.google.cloud.datacatalog.Entry>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.getEntryCallable))))

(defn update-tag-template-callable
  "Updates a tag template. This method cannot be used to update the fields of a template. The tag
   template fields are represented as separate resources and should be updated using their own
   create/update/delete methods.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     TagTemplate tagTemplate = TagTemplate.newBuilder().build();
     UpdateTagTemplateRequest request = UpdateTagTemplateRequest.newBuilder()
       .setTagTemplate(tagTemplate)
       .build();
     ApiFuture<TagTemplate> future = dataCatalogClient.updateTagTemplateCallable().futureCall(request);
     // Do something
     TagTemplate response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.UpdateTagTemplateRequest,com.google.cloud.datacatalog.TagTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.updateTagTemplateCallable))))

(defn update-entry
  "Updates an existing entry.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     Entry entry = Entry.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     Entry response = dataCatalogClient.updateEntry(entry, updateMask);
   }

  entry - Required. The updated Entry. - `com.google.cloud.datacatalog.Entry`
  update-mask - Optional. The fields to update on the entry. If absent or empty, all modifiable fields are updated. Modifiable fields in synced entries: 1. schema (Pub/Sub topics only) Modifiable fields in native entries: 1. display_name 2. description 3. schema - `com.google.protobuf.FieldMask`

  returns: `com.google.cloud.datacatalog.Entry`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datacatalog.Entry [^DataCatalogClient this ^com.google.cloud.datacatalog.Entry entry ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateEntry entry update-mask)))
  (^com.google.cloud.datacatalog.Entry [^DataCatalogClient this ^com.google.cloud.datacatalog.UpdateEntryRequest request]
    (-> this (.updateEntry request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^DataCatalogClient this]
    (-> this (.isShutdown))))

(defn get-tag-template-callable
  "Gets a tag template.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedName = DataCatalogClient.formatTagTemplateName(\"[PROJECT]\", \"[LOCATION]\", \"[TAG_TEMPLATE]\");
     GetTagTemplateRequest request = GetTagTemplateRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<TagTemplate> future = dataCatalogClient.getTagTemplateCallable().futureCall(request);
     // Do something
     TagTemplate response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.GetTagTemplateRequest,com.google.cloud.datacatalog.TagTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.getTagTemplateCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^DataCatalogClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^DataCatalogClient this]
    (-> this (.shutdown))))

(defn delete-tag-template-field
  "Deletes a field in a tag template and all uses of that field.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedName = DataCatalogClient.formatFieldName(\"[PROJECT]\", \"[LOCATION]\", \"[TAG_TEMPLATE]\", \"[FIELD]\");
     boolean force = false;
     dataCatalogClient.deleteTagTemplateField(formattedName, force);
   }

  name - Required. The name of the tag template field to delete. For example, \"projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}/fields/{tag_template_field_id}\". - `java.lang.String`
  force - Required. Currently, this field must always be set to <code>true</code>. This confirms the deletion of this field from any tags using this field. <code>force = false</code> will be supported in the future. - `boolean`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DataCatalogClient this ^java.lang.String name ^Boolean force]
    (-> this (.deleteTagTemplateField name force)))
  ([^DataCatalogClient this ^com.google.cloud.datacatalog.DeleteTagTemplateFieldRequest request]
    (-> this (.deleteTagTemplateField request))))

(defn get-tag-template
  "Gets a tag template.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedName = DataCatalogClient.formatTagTemplateName(\"[PROJECT]\", \"[LOCATION]\", \"[TAG_TEMPLATE]\");
     TagTemplate response = dataCatalogClient.getTagTemplate(formattedName);
   }

  name - Required. The name of the tag template. For example, \"projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}\". - `java.lang.String`

  returns: `com.google.cloud.datacatalog.TagTemplate`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datacatalog.TagTemplate [^DataCatalogClient this ^java.lang.String name]
    (-> this (.getTagTemplate name))))

(defn update-entry-callable
  "Updates an existing entry.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     Entry entry = Entry.newBuilder().build();
     UpdateEntryRequest request = UpdateEntryRequest.newBuilder()
       .setEntry(entry)
       .build();
     ApiFuture<Entry> future = dataCatalogClient.updateEntryCallable().futureCall(request);
     // Do something
     Entry response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.UpdateEntryRequest,com.google.cloud.datacatalog.Entry>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.updateEntryCallable))))

(defn delete-tag
  "Deletes a tag.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedName = DataCatalogClient.formatTagName(\"[PROJECT]\", \"[LOCATION]\", \"[ENTRY_GROUP]\", \"[ENTRY]\", \"[TAG]\");
     dataCatalogClient.deleteTag(formattedName);
   }

  name - Required. The name of the tag to delete. For example, \"projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id}/tags/{tag_id}\". - `java.lang.String`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DataCatalogClient this ^java.lang.String name]
    (-> this (.deleteTag name))))

(defn set-iam-policy-callable
  "Sets the access control policy for a resource. Replaces any existing policy. Supported
   resources are: - Tag templates. Note, this method cannot be used to manage policies for
   BigQuery, Cloud Pub/Sub and any external Google Cloud Platform resources synced to Cloud Data
   Catalog.

   Callers must have following Google IAM permission `datacatalog.tagTemplates.setIamPolicy` to
   set policies on tag templates.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedResource = DataCatalogClient.formatTagTemplateName(\"[PROJECT]\", \"[LOCATION]\", \"[TAG_TEMPLATE]\");
     Policy policy = Policy.newBuilder().build();
     SetIamPolicyRequest request = SetIamPolicyRequest.newBuilder()
       .setResource(formattedResource)
       .setPolicy(policy)
       .build();
     ApiFuture<Policy> future = dataCatalogClient.setIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.setIamPolicyCallable))))

(defn search-catalog
  "Searches Data Catalog for multiple resources like entries, tags that match a query.

   This is a custom method (https://cloud.google.com/apis/design/custom_methods) and does not
   return the complete resource, only the resource identifier and high level fields. Clients can
   subsequentally call Get methods.

   Note that searches do not have full recall. There may be results that match your query but
   are not returned, even in subsequent pages of results. These missing results may vary across
   repeated calls to search. Do not rely on this method if you need to guarantee full recall.

   See [Data Catalog Search Syntax](/data-catalog/docs/how-to/search-reference) for more
   information.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     SearchCatalogRequest.Scope scope = SearchCatalogRequest.Scope.newBuilder().build();
     String query = \"\";
     String orderBy = \"\";
     for (SearchCatalogResult element : dataCatalogClient.searchCatalog(scope, query, orderBy).iterateAll()) {
       // doThingsWith(element);
     }
   }

  scope - Required. The scope of this search request. - `com.google.cloud.datacatalog.SearchCatalogRequest$Scope`
  query - Required. The query string in search query syntax. The query must be non-empty. Query strings can be simple as \"x\" or more qualified as: * name:x * column:x * description:y Note: Query tokens need to have a minimum of 3 characters for substring matching to work correctly. See [Data Catalog Search Syntax](/data-catalog/docs/how-to/search-reference) for more information. - `java.lang.String`
  order-by - Specifies the ordering of results, currently supported case-sensitive choices are: <ul> <li> relevance </li> <li> last_access_timestamp [asc|desc], defaults to descending if not specified, </li> <li> last_modified_timestamp [asc|desc], defaults to descending if not specified. </li> </ul> - `java.lang.String`

  returns: `com.google.cloud.datacatalog.v1beta1.DataCatalogClient$SearchCatalogPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datacatalog.v1beta1.DataCatalogClient$SearchCatalogPagedResponse [^DataCatalogClient this ^com.google.cloud.datacatalog.SearchCatalogRequest$Scope scope ^java.lang.String query ^java.lang.String order-by]
    (-> this (.searchCatalog scope query order-by)))
  (^com.google.cloud.datacatalog.v1beta1.DataCatalogClient$SearchCatalogPagedResponse [^DataCatalogClient this ^com.google.cloud.datacatalog.SearchCatalogRequest request]
    (-> this (.searchCatalog request))))

(defn search-catalog-callable
  "Searches Data Catalog for multiple resources like entries, tags that match a query.

   This is a custom method (https://cloud.google.com/apis/design/custom_methods) and does not
   return the complete resource, only the resource identifier and high level fields. Clients can
   subsequentally call Get methods.

   Note that searches do not have full recall. There may be results that match your query but
   are not returned, even in subsequent pages of results. These missing results may vary across
   repeated calls to search. Do not rely on this method if you need to guarantee full recall.

   See [Data Catalog Search Syntax](/data-catalog/docs/how-to/search-reference) for more
   information.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     SearchCatalogRequest.Scope scope = SearchCatalogRequest.Scope.newBuilder().build();
     String query = \"\";
     SearchCatalogRequest request = SearchCatalogRequest.newBuilder()
       .setScope(scope)
       .setQuery(query)
       .build();
     while (true) {
       SearchCatalogResponse response = dataCatalogClient.searchCatalogCallable().call(request);
       for (SearchCatalogResult element : response.getResultsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.SearchCatalogRequest,com.google.cloud.datacatalog.SearchCatalogResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.searchCatalogCallable))))

(defn close
  ""
  ([^DataCatalogClient this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "Returns the caller's permissions on a resource. If the resource does not exist, an empty set of
   permissions is returned (We don't return a `NOT_FOUND` error).

   Supported resource are: - tag templates. Note, this method cannot be used to manage policies
   for BigQuery, Cloud Pub/Sub and any external Google Cloud Platform resources synced to Cloud
   Data Catalog.

   A caller is not required to have Google IAM permission to make this request.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedResource = DataCatalogClient.formatTagTemplateName(\"[PROJECT]\", \"[LOCATION]\", \"[TAG_TEMPLATE]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsRequest request = TestIamPermissionsRequest.newBuilder()
       .setResource(formattedResource)
       .addAllPermissions(permissions)
       .build();
     ApiFuture<TestIamPermissionsResponse> future = dataCatalogClient.testIamPermissionsCallable().futureCall(request);
     // Do something
     TestIamPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.testIamPermissionsCallable))))

(defn list-tags-paged-callable
  "Lists the tags on an [Entry][google.cloud.datacatalog.v1beta1.Entry].

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedParent = DataCatalogClient.formatEntryName(\"[PROJECT]\", \"[LOCATION]\", \"[ENTRY_GROUP]\", \"[ENTRY]\");
     ListTagsRequest request = ListTagsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     ApiFuture<ListTagsPagedResponse> future = dataCatalogClient.listTagsPagedCallable().futureCall(request);
     // Do something
     for (Tag element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.ListTagsRequest,com.google.cloud.datacatalog.v1beta1.DataCatalogClient$ListTagsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.listTagsPagedCallable))))

(defn create-tag-template-field
  "Creates a field in a tag template.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedParent = DataCatalogClient.formatTagTemplateName(\"[PROJECT]\", \"[LOCATION]\", \"[TAG_TEMPLATE]\");
     String tagTemplateFieldId = \"\";
     TagTemplateField tagTemplateField = TagTemplateField.newBuilder().build();
     TagTemplateField response = dataCatalogClient.createTagTemplateField(formattedParent, tagTemplateFieldId, tagTemplateField);
   }

  parent - Required. The name of the project this template is in. Example: \"projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}\". Note that this TagTemplateField may not actually be stored in the location in this name. - `java.lang.String`
  tag-template-field-id - Required. The id of the tag template field to create. Field ids can contain letters (both uppercase and lowercase), numbers (0-9), underscores (_) and dashes (-). Field ids must be at least 1 character long and at most 128 characters long. Field ids must also be unique to their template. - `java.lang.String`
  tag-template-field - Required. The tag template field to create. - `com.google.cloud.datacatalog.TagTemplateField`

  returns: `com.google.cloud.datacatalog.TagTemplateField`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datacatalog.TagTemplateField [^DataCatalogClient this ^java.lang.String parent ^java.lang.String tag-template-field-id ^com.google.cloud.datacatalog.TagTemplateField tag-template-field]
    (-> this (.createTagTemplateField parent tag-template-field-id tag-template-field)))
  (^com.google.cloud.datacatalog.TagTemplateField [^DataCatalogClient this ^com.google.cloud.datacatalog.CreateTagTemplateFieldRequest request]
    (-> this (.createTagTemplateField request))))

(defn get-iam-policy
  "Gets the access control policy for a resource. A `NOT_FOUND` error is returned if the resource
   does not exist. An empty policy is returned if the resource exists but does not have a policy
   set on it.

   Supported resources are: - Tag templates. Note, this method cannot be used to manage
   policies for BigQuery, Cloud Pub/Sub and any external Google Cloud Platform resources synced to
   Cloud Data Catalog.

   Callers must have following Google IAM permission `datacatalog.tagTemplates.getIamPolicy` to
   get policies on tag templates.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedResource = DataCatalogClient.formatTagTemplateName(\"[PROJECT]\", \"[LOCATION]\", \"[TAG_TEMPLATE]\");
     Policy response = dataCatalogClient.getIamPolicy(formattedResource);
   }

  resource - REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field. - `java.lang.String`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^DataCatalogClient this ^java.lang.String resource]
    (-> this (.getIamPolicy resource))))

(defn update-tag-template-field
  "Updates a field in a tag template. This method cannot be used to update the field type.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedName = DataCatalogClient.formatFieldName(\"[PROJECT]\", \"[LOCATION]\", \"[TAG_TEMPLATE]\", \"[FIELD]\");
     TagTemplateField tagTemplateField = TagTemplateField.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     TagTemplateField response = dataCatalogClient.updateTagTemplateField(formattedName, tagTemplateField, updateMask);
   }

  name - Required. The name of the tag template field. For example, \"projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}/fields/{tag_template_field_id}\". - `java.lang.String`
  tag-template-field - Required. The template to update. - `com.google.cloud.datacatalog.TagTemplateField`
  update-mask - Optional. The field mask specifies the parts of the template to overwrite. Allowed fields: * display_name * type.enum_type If update_mask is omitted, all of the allowed fields above will be updated. When updating an enum type, the provided values will be merged with the existing values. Therefore, enum values can only be added, existing enum values cannot be deleted nor renamed. - `com.google.protobuf.FieldMask`

  returns: `com.google.cloud.datacatalog.TagTemplateField`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datacatalog.TagTemplateField [^DataCatalogClient this ^java.lang.String name ^com.google.cloud.datacatalog.TagTemplateField tag-template-field ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateTagTemplateField name tag-template-field update-mask)))
  (^com.google.cloud.datacatalog.TagTemplateField [^DataCatalogClient this ^com.google.cloud.datacatalog.UpdateTagTemplateFieldRequest request]
    (-> this (.updateTagTemplateField request))))

(defn create-tag
  "Creates a tag on an [Entry][google.cloud.datacatalog.v1beta1.Entry].

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedParent = DataCatalogClient.formatEntryName(\"[PROJECT]\", \"[LOCATION]\", \"[ENTRY_GROUP]\", \"[ENTRY]\");
     Tag tag = Tag.newBuilder().build();
     Tag response = dataCatalogClient.createTag(formattedParent, tag);
   }

  parent - Required. The name of the resource to attach this tag to. Tags can be attached to Entries. (example: \"projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id}\"). Note that this Tag and its child resources may not actually be stored in the location in this name. - `java.lang.String`
  tag - Required. The tag to create. - `com.google.cloud.datacatalog.Tag`

  returns: `com.google.cloud.datacatalog.Tag`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datacatalog.Tag [^DataCatalogClient this ^java.lang.String parent ^com.google.cloud.datacatalog.Tag tag]
    (-> this (.createTag parent tag)))
  (^com.google.cloud.datacatalog.Tag [^DataCatalogClient this ^com.google.cloud.datacatalog.CreateTagRequest request]
    (-> this (.createTag request))))

(defn create-tag-callable
  "Creates a tag on an [Entry][google.cloud.datacatalog.v1beta1.Entry].

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedParent = DataCatalogClient.formatEntryName(\"[PROJECT]\", \"[LOCATION]\", \"[ENTRY_GROUP]\", \"[ENTRY]\");
     Tag tag = Tag.newBuilder().build();
     CreateTagRequest request = CreateTagRequest.newBuilder()
       .setParent(formattedParent)
       .setTag(tag)
       .build();
     ApiFuture<Tag> future = dataCatalogClient.createTagCallable().futureCall(request);
     // Do something
     Tag response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.CreateTagRequest,com.google.cloud.datacatalog.Tag>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.createTagCallable))))

(defn update-tag-template
  "Updates a tag template. This method cannot be used to update the fields of a template. The tag
   template fields are represented as separate resources and should be updated using their own
   create/update/delete methods.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     TagTemplate tagTemplate = TagTemplate.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     TagTemplate response = dataCatalogClient.updateTagTemplate(tagTemplate, updateMask);
   }

  tag-template - Required. The template to update. - `com.google.cloud.datacatalog.TagTemplate`
  update-mask - Optional. The field mask specifies the parts of the template to overwrite. Allowed fields: * display_name If update_mask is omitted, all of the allowed fields above will be updated. - `com.google.protobuf.FieldMask`

  returns: `com.google.cloud.datacatalog.TagTemplate`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datacatalog.TagTemplate [^DataCatalogClient this ^com.google.cloud.datacatalog.TagTemplate tag-template ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateTagTemplate tag-template update-mask)))
  (^com.google.cloud.datacatalog.TagTemplate [^DataCatalogClient this ^com.google.cloud.datacatalog.UpdateTagTemplateRequest request]
    (-> this (.updateTagTemplate request))))

(defn list-tags-callable
  "Lists the tags on an [Entry][google.cloud.datacatalog.v1beta1.Entry].

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedParent = DataCatalogClient.formatEntryName(\"[PROJECT]\", \"[LOCATION]\", \"[ENTRY_GROUP]\", \"[ENTRY]\");
     ListTagsRequest request = ListTagsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     while (true) {
       ListTagsResponse response = dataCatalogClient.listTagsCallable().call(request);
       for (Tag element : response.getTagsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.ListTagsRequest,com.google.cloud.datacatalog.ListTagsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.listTagsCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^DataCatalogClient this]
    (-> this (.isTerminated))))

(defn delete-tag-template-field-callable
  "Deletes a field in a tag template and all uses of that field.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedName = DataCatalogClient.formatFieldName(\"[PROJECT]\", \"[LOCATION]\", \"[TAG_TEMPLATE]\", \"[FIELD]\");
     boolean force = false;
     DeleteTagTemplateFieldRequest request = DeleteTagTemplateFieldRequest.newBuilder()
       .setName(formattedName)
       .setForce(force)
       .build();
     ApiFuture<Void> future = dataCatalogClient.deleteTagTemplateFieldCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.DeleteTagTemplateFieldRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.deleteTagTemplateFieldCallable))))

(defn lookup-entry
  "Get an entry by target resource name. This method allows clients to use the resource name from
   the source Google Cloud Platform service to get the Data Catalog Entry.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     LookupEntryRequest request = LookupEntryRequest.newBuilder().build();
     Entry response = dataCatalogClient.lookupEntry(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.datacatalog.LookupEntryRequest`

  returns: `com.google.cloud.datacatalog.Entry`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datacatalog.Entry [^DataCatalogClient this ^com.google.cloud.datacatalog.LookupEntryRequest request]
    (-> this (.lookupEntry request))))

(defn update-tag-template-field-callable
  "Updates a field in a tag template. This method cannot be used to update the field type.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedName = DataCatalogClient.formatFieldName(\"[PROJECT]\", \"[LOCATION]\", \"[TAG_TEMPLATE]\", \"[FIELD]\");
     TagTemplateField tagTemplateField = TagTemplateField.newBuilder().build();
     UpdateTagTemplateFieldRequest request = UpdateTagTemplateFieldRequest.newBuilder()
       .setName(formattedName)
       .setTagTemplateField(tagTemplateField)
       .build();
     ApiFuture<TagTemplateField> future = dataCatalogClient.updateTagTemplateFieldCallable().futureCall(request);
     // Do something
     TagTemplateField response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.UpdateTagTemplateFieldRequest,com.google.cloud.datacatalog.TagTemplateField>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.updateTagTemplateFieldCallable))))

(defn delete-tag-template-callable
  "Deletes a tag template and all tags using the template.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedName = DataCatalogClient.formatTagTemplateName(\"[PROJECT]\", \"[LOCATION]\", \"[TAG_TEMPLATE]\");
     boolean force = false;
     DeleteTagTemplateRequest request = DeleteTagTemplateRequest.newBuilder()
       .setName(formattedName)
       .setForce(force)
       .build();
     ApiFuture<Void> future = dataCatalogClient.deleteTagTemplateCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.DeleteTagTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.deleteTagTemplateCallable))))

(defn update-tag-callable
  "Updates an existing tag.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     Tag tag = Tag.newBuilder().build();
     UpdateTagRequest request = UpdateTagRequest.newBuilder()
       .setTag(tag)
       .build();
     ApiFuture<Tag> future = dataCatalogClient.updateTagCallable().futureCall(request);
     // Do something
     Tag response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.UpdateTagRequest,com.google.cloud.datacatalog.Tag>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.updateTagCallable))))

(defn rename-tag-template-field-callable
  "Renames a field in a tag template.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedName = DataCatalogClient.formatFieldName(\"[PROJECT]\", \"[LOCATION]\", \"[TAG_TEMPLATE]\", \"[FIELD]\");
     String newTagTemplateFieldId = \"\";
     RenameTagTemplateFieldRequest request = RenameTagTemplateFieldRequest.newBuilder()
       .setName(formattedName)
       .setNewTagTemplateFieldId(newTagTemplateFieldId)
       .build();
     ApiFuture<TagTemplateField> future = dataCatalogClient.renameTagTemplateFieldCallable().futureCall(request);
     // Do something
     TagTemplateField response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.RenameTagTemplateFieldRequest,com.google.cloud.datacatalog.TagTemplateField>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.renameTagTemplateFieldCallable))))

(defn shutdown-now
  ""
  ([^DataCatalogClient this]
    (-> this (.shutdownNow))))

(defn create-tag-template-field-callable
  "Creates a field in a tag template.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedParent = DataCatalogClient.formatTagTemplateName(\"[PROJECT]\", \"[LOCATION]\", \"[TAG_TEMPLATE]\");
     String tagTemplateFieldId = \"\";
     TagTemplateField tagTemplateField = TagTemplateField.newBuilder().build();
     CreateTagTemplateFieldRequest request = CreateTagTemplateFieldRequest.newBuilder()
       .setParent(formattedParent)
       .setTagTemplateFieldId(tagTemplateFieldId)
       .setTagTemplateField(tagTemplateField)
       .build();
     ApiFuture<TagTemplateField> future = dataCatalogClient.createTagTemplateFieldCallable().futureCall(request);
     // Do something
     TagTemplateField response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.CreateTagTemplateFieldRequest,com.google.cloud.datacatalog.TagTemplateField>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogClient this]
    (-> this (.createTagTemplateFieldCallable))))

(defn update-tag
  "Updates an existing tag.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     Tag tag = Tag.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     Tag response = dataCatalogClient.updateTag(tag, updateMask);
   }

  tag - Required. The updated tag. - `com.google.cloud.datacatalog.Tag`
  update-mask - Optional. The fields to update on the Tag. If absent or empty, all modifiable fields are updated. Currently the only modifiable field is the field `fields`. - `com.google.protobuf.FieldMask`

  returns: `com.google.cloud.datacatalog.Tag`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datacatalog.Tag [^DataCatalogClient this ^com.google.cloud.datacatalog.Tag tag ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateTag tag update-mask)))
  (^com.google.cloud.datacatalog.Tag [^DataCatalogClient this ^com.google.cloud.datacatalog.UpdateTagRequest request]
    (-> this (.updateTag request))))

(defn test-iam-permissions
  "Returns the caller's permissions on a resource. If the resource does not exist, an empty set of
   permissions is returned (We don't return a `NOT_FOUND` error).

   Supported resource are: - tag templates. Note, this method cannot be used to manage policies
   for BigQuery, Cloud Pub/Sub and any external Google Cloud Platform resources synced to Cloud
   Data Catalog.

   A caller is not required to have Google IAM permission to make this request.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedResource = DataCatalogClient.formatTagTemplateName(\"[PROJECT]\", \"[LOCATION]\", \"[TAG_TEMPLATE]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsResponse response = dataCatalogClient.testIamPermissions(formattedResource, permissions);
   }

  resource - REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field. - `java.lang.String`
  permissions - The set of permissions to check for the `resource`. Permissions with wildcards (such as '*' or 'storage.*') are not allowed. For more information see [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions). - `java.util.List`

  returns: `com.google.iam.v1.TestIamPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.TestIamPermissionsResponse [^DataCatalogClient this ^java.lang.String resource ^java.util.List permissions]
    (-> this (.testIamPermissions resource permissions)))
  (^com.google.iam.v1.TestIamPermissionsResponse [^DataCatalogClient this ^com.google.iam.v1.TestIamPermissionsRequest request]
    (-> this (.testIamPermissions request))))

(defn rename-tag-template-field
  "Renames a field in a tag template.

   Sample code:



   try (DataCatalogClient dataCatalogClient = DataCatalogClient.create()) {
     String formattedName = DataCatalogClient.formatFieldName(\"[PROJECT]\", \"[LOCATION]\", \"[TAG_TEMPLATE]\", \"[FIELD]\");
     String newTagTemplateFieldId = \"\";
     TagTemplateField response = dataCatalogClient.renameTagTemplateField(formattedName, newTagTemplateFieldId);
   }

  name - Required. The name of the tag template. For example, \"projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id}/fields/{tag_template_field_id}\". - `java.lang.String`
  new-tag-template-field-id - Required. The new ID of this tag template field. For example, \"my_new_field\". - `java.lang.String`

  returns: `com.google.cloud.datacatalog.TagTemplateField`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.datacatalog.TagTemplateField [^DataCatalogClient this ^java.lang.String name ^java.lang.String new-tag-template-field-id]
    (-> this (.renameTagTemplateField name new-tag-template-field-id)))
  (^com.google.cloud.datacatalog.TagTemplateField [^DataCatalogClient this ^com.google.cloud.datacatalog.RenameTagTemplateFieldRequest request]
    (-> this (.renameTagTemplateField request))))

