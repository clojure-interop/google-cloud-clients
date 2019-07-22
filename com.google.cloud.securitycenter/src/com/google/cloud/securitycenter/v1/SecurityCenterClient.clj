(ns com.google.cloud.securitycenter.v1.SecurityCenterClient
  "Service Description: V1 APIs for Security Center service.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
    OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
    Source source = Source.newBuilder().build();
    Source response = securityCenterClient.createSource(parent, source);
  }

  Note: close() needs to be called on the securityCenterClient object to clean up resources such
  as threads. In the example above, try-with-resources is used, which automatically calls close().

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

  This class can be customized by passing in a custom instance of SecurityCenterSettings to
  create(). For example:

  To customize credentials:



  SecurityCenterSettings securityCenterSettings =
      SecurityCenterSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  SecurityCenterClient securityCenterClient =
      SecurityCenterClient.create(securityCenterSettings);

  To customize the endpoint:



  SecurityCenterSettings securityCenterSettings =
      SecurityCenterSettings.newBuilder().setEndpoint(myEndpoint).build();
  SecurityCenterClient securityCenterClient =
      SecurityCenterClient.create(securityCenterSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.securitycenter.v1 SecurityCenterClient]))

(defn *create
  "Constructs an instance of SecurityCenterClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.securitycenter.v1.SecurityCenterSettings`

  returns: `com.google.cloud.securitycenter.v1.SecurityCenterClient`

  throws: java.io.IOException"
  (^com.google.cloud.securitycenter.v1.SecurityCenterClient [^com.google.cloud.securitycenter.v1.SecurityCenterSettings settings]
    (SecurityCenterClient/create settings))
  (^com.google.cloud.securitycenter.v1.SecurityCenterClient []
    (SecurityCenterClient/create )))

(defn list-findings
  "Lists an organization or source's findings.

   To list across all sources provide a `-` as the source id. Example:
   /v1/organizations/123/sources/-/findings

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     SourceName parent = SourceName.of(\"[ORGANIZATION]\", \"[SOURCE]\");
     ListFindingsRequest request = ListFindingsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     for (ListFindingsResponse.ListFindingsResult element : securityCenterClient.listFindings(request).iterateAll()) {
       // doThingsWith(element);
     }
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.securitycenter.v1.ListFindingsRequest`

  returns: `com.google.cloud.securitycenter.v1.SecurityCenterClient$ListFindingsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.securitycenter.v1.SecurityCenterClient$ListFindingsPagedResponse [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.ListFindingsRequest request]
    (-> this (.listFindings request))))

(defn list-sources-paged-callable
  "Lists all sources belonging to an organization.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     ListSourcesRequest request = ListSourcesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListSourcesPagedResponse> future = securityCenterClient.listSourcesPagedCallable().futureCall(request);
     // Do something
     for (Source element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.ListSourcesRequest,com.google.cloud.securitycenter.v1.SecurityCenterClient$ListSourcesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.listSourcesPagedCallable))))

(defn get-iam-policy-callable
  "Gets the access control policy on the specified Source.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     ResourceName resource = SourceName.of(\"[ORGANIZATION]\", \"[SOURCE]\");
     GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder()
       .setResource(resource.toString())
       .build();
     ApiFuture<Policy> future = securityCenterClient.getIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.getIamPolicyCallable))))

(defn set-iam-policy
  "Sets the access control policy on the specified Source.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     SourceName resource = SourceName.of(\"[ORGANIZATION]\", \"[SOURCE]\");
     Policy policy = Policy.newBuilder().build();
     Policy response = securityCenterClient.setIamPolicy(resource, policy);
   }

  resource - REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field. - `com.google.cloud.securitycenter.v1.SourceName`
  policy - REQUIRED: The complete policy to be applied to the `resource`. The size of the policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Cloud Platform services (such as Projects) might reject them. - `com.google.iam.v1.Policy`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.SourceName resource ^com.google.iam.v1.Policy policy]
    (-> this (.setIamPolicy resource policy)))
  (^com.google.iam.v1.Policy [^SecurityCenterClient this ^com.google.iam.v1.SetIamPolicyRequest request]
    (-> this (.setIamPolicy request))))

(defn update-source-callable
  "Updates a source.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     Source source = Source.newBuilder().build();
     UpdateSourceRequest request = UpdateSourceRequest.newBuilder()
       .setSource(source)
       .build();
     ApiFuture<Source> future = securityCenterClient.updateSourceCallable().futureCall(request);
     // Do something
     Source response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.UpdateSourceRequest,com.google.cloud.securitycenter.v1.Source>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.updateSourceCallable))))

(defn get-settings
  "returns: `com.google.cloud.securitycenter.v1.SecurityCenterSettings`"
  (^com.google.cloud.securitycenter.v1.SecurityCenterSettings [^SecurityCenterClient this]
    (-> this (.getSettings))))

(defn update-organization-settings-callable
  "Updates an organization's settings.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     OrganizationSettings organizationSettings = OrganizationSettings.newBuilder().build();
     UpdateOrganizationSettingsRequest request = UpdateOrganizationSettingsRequest.newBuilder()
       .setOrganizationSettings(organizationSettings)
       .build();
     ApiFuture<OrganizationSettings> future = securityCenterClient.updateOrganizationSettingsCallable().futureCall(request);
     // Do something
     OrganizationSettings response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest,com.google.cloud.securitycenter.v1.OrganizationSettings>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.updateOrganizationSettingsCallable))))

(defn run-asset-discovery-callable
  "Runs asset discovery. The discovery is tracked with a long-running operation.

   This API can only be called with limited frequency for an organization. If it is called too
   frequently the caller will receive a TOO_MANY_REQUESTS error.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     RunAssetDiscoveryRequest request = RunAssetDiscoveryRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<Operation> future = securityCenterClient.runAssetDiscoveryCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.RunAssetDiscoveryRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.runAssetDiscoveryCallable))))

(defn list-findings-callable
  "Lists an organization or source's findings.

   To list across all sources provide a `-` as the source id. Example:
   /v1/organizations/123/sources/-/findings

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     SourceName parent = SourceName.of(\"[ORGANIZATION]\", \"[SOURCE]\");
     ListFindingsRequest request = ListFindingsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListFindingsResponse response = securityCenterClient.listFindingsCallable().call(request);
       for (ListFindingsResponse.ListFindingsResult element : response.getListFindingsResultsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.ListFindingsRequest,com.google.cloud.securitycenter.v1.ListFindingsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.listFindingsCallable))))

(defn update-source
  "Updates a source.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     Source source = Source.newBuilder().build();
     Source response = securityCenterClient.updateSource(source);
   }

  source - The source resource to update. - `com.google.cloud.securitycenter.v1.Source`

  returns: `com.google.cloud.securitycenter.v1.Source`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.securitycenter.v1.Source [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.Source source]
    (-> this (.updateSource source))))

(defn group-findings-paged-callable
  "Filters an organization or source's findings and groups them by their specified properties.

   To group across all sources provide a `-` as the source id. Example:
   /v1/organizations/123/sources/-/findings

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     SourceName parent = SourceName.of(\"[ORGANIZATION]\", \"[SOURCE]\");
     String groupBy = \"\";
     GroupFindingsRequest request = GroupFindingsRequest.newBuilder()
       .setParent(parent.toString())
       .setGroupBy(groupBy)
       .build();
     ApiFuture<GroupFindingsPagedResponse> future = securityCenterClient.groupFindingsPagedCallable().futureCall(request);
     // Do something
     for (GroupResult element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.GroupFindingsRequest,com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupFindingsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.groupFindingsPagedCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.securitycenter.v1.stub.SecurityCenterStub`"
  ([^SecurityCenterClient this]
    (-> this (.getStub))))

(defn run-asset-discovery-async
  "Runs asset discovery. The discovery is tracked with a long-running operation.

   This API can only be called with limited frequency for an organization. If it is called too
   frequently the caller will receive a TOO_MANY_REQUESTS error.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     RunAssetDiscoveryResponse response = securityCenterClient.runAssetDiscoveryAsync(parent).get();
   }

  parent - Name of the organization to run asset discovery for. Its format is \"organizations/[organization_id]\". - `com.google.cloud.securitycenter.v1.OrganizationName`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.securitycenter.v1.RunAssetDiscoveryResponse,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.OrganizationName parent]
    (-> this (.runAssetDiscoveryAsync parent))))

(defn update-finding-callable
  "Creates or updates a finding. The corresponding source must exist for a finding creation to
   succeed.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     Finding finding = Finding.newBuilder().build();
     UpdateFindingRequest request = UpdateFindingRequest.newBuilder()
       .setFinding(finding)
       .build();
     ApiFuture<Finding> future = securityCenterClient.updateFindingCallable().futureCall(request);
     // Do something
     Finding response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.UpdateFindingRequest,com.google.cloud.securitycenter.v1.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.updateFindingCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^SecurityCenterClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^SecurityCenterClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^SecurityCenterClient this]
    (-> this (.shutdown))))

(defn list-findings-paged-callable
  "Lists an organization or source's findings.

   To list across all sources provide a `-` as the source id. Example:
   /v1/organizations/123/sources/-/findings

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     SourceName parent = SourceName.of(\"[ORGANIZATION]\", \"[SOURCE]\");
     ListFindingsRequest request = ListFindingsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListFindingsPagedResponse> future = securityCenterClient.listFindingsPagedCallable().futureCall(request);
     // Do something
     for (ListFindingsResponse.ListFindingsResult element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.ListFindingsRequest,com.google.cloud.securitycenter.v1.SecurityCenterClient$ListFindingsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.listFindingsPagedCallable))))

(defn group-findings
  "Filters an organization or source's findings and groups them by their specified properties.

   To group across all sources provide a `-` as the source id. Example:
   /v1/organizations/123/sources/-/findings

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     SourceName parent = SourceName.of(\"[ORGANIZATION]\", \"[SOURCE]\");
     String groupBy = \"\";
     for (GroupResult element : securityCenterClient.groupFindings(parent, groupBy).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Name of the source to groupBy. Its format is \"organizations/[organization_id]/sources/[source_id]\". To groupBy across all sources provide a source_id of `-`. For example: organizations/123/sources/- - `com.google.cloud.securitycenter.v1.SourceName`
  group-by - Expression that defines what assets fields to use for grouping (including `state_change`). The string value should follow SQL syntax: comma separated list of fields. For example: \"parent,resource_name\". The following fields are supported: * resource_name * category * state * parent The following fields are supported when compare_duration is set: * state_change - `java.lang.String`

  returns: `com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupFindingsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupFindingsPagedResponse [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.SourceName parent ^java.lang.String group-by]
    (-> this (.groupFindings parent group-by)))
  (^com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupFindingsPagedResponse [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.GroupFindingsRequest request]
    (-> this (.groupFindings request))))

(defn list-assets-callable
  "Lists an organization's assets.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     ListAssetsRequest request = ListAssetsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListAssetsResponse response = securityCenterClient.listAssetsCallable().call(request);
       for (ListAssetsResponse.ListAssetsResult element : response.getListAssetsResultsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.ListAssetsRequest,com.google.cloud.securitycenter.v1.ListAssetsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.listAssetsCallable))))

(defn get-source-callable
  "Gets a source.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     SourceName name = SourceName.of(\"[ORGANIZATION]\", \"[SOURCE]\");
     GetSourceRequest request = GetSourceRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Source> future = securityCenterClient.getSourceCallable().futureCall(request);
     // Do something
     Source response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.GetSourceRequest,com.google.cloud.securitycenter.v1.Source>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.getSourceCallable))))

(defn get-source
  "Gets a source.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     SourceName name = SourceName.of(\"[ORGANIZATION]\", \"[SOURCE]\");
     Source response = securityCenterClient.getSource(name);
   }

  name - Relative resource name of the source. Its format is \"organizations/[organization_id]/source/[source_id]\". - `com.google.cloud.securitycenter.v1.SourceName`

  returns: `com.google.cloud.securitycenter.v1.Source`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.securitycenter.v1.Source [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.SourceName name]
    (-> this (.getSource name))))

(defn update-organization-settings
  "Updates an organization's settings.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     OrganizationSettings organizationSettings = OrganizationSettings.newBuilder().build();
     OrganizationSettings response = securityCenterClient.updateOrganizationSettings(organizationSettings);
   }

  organization-settings - The organization settings resource to update. - `com.google.cloud.securitycenter.v1.OrganizationSettings`

  returns: `com.google.cloud.securitycenter.v1.OrganizationSettings`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.securitycenter.v1.OrganizationSettings [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.OrganizationSettings organization-settings]
    (-> this (.updateOrganizationSettings organization-settings))))

(defn group-assets-paged-callable
  "Filters an organization's assets and groups them by their specified properties.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     String groupBy = \"\";
     GroupAssetsRequest request = GroupAssetsRequest.newBuilder()
       .setParent(parent.toString())
       .setGroupBy(groupBy)
       .build();
     ApiFuture<GroupAssetsPagedResponse> future = securityCenterClient.groupAssetsPagedCallable().futureCall(request);
     // Do something
     for (GroupResult element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.GroupAssetsRequest,com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupAssetsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.groupAssetsPagedCallable))))

(defn update-security-marks
  "Updates security marks.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     SecurityMarks securityMarks = SecurityMarks.newBuilder().build();
     SecurityMarks response = securityCenterClient.updateSecurityMarks(securityMarks);
   }

  security-marks - The security marks resource to update. - `com.google.cloud.securitycenter.v1.SecurityMarks`

  returns: `com.google.cloud.securitycenter.v1.SecurityMarks`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.securitycenter.v1.SecurityMarks [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.SecurityMarks security-marks]
    (-> this (.updateSecurityMarks security-marks))))

(defn list-sources
  "Lists all sources belonging to an organization.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     for (Source element : securityCenterClient.listSources(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Resource name of the parent of sources to list. Its format should be \"organizations/[organization_id]\". - `com.google.cloud.securitycenter.v1.OrganizationName`

  returns: `com.google.cloud.securitycenter.v1.SecurityCenterClient$ListSourcesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.securitycenter.v1.SecurityCenterClient$ListSourcesPagedResponse [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.OrganizationName parent]
    (-> this (.listSources parent))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^SecurityCenterClient this]
    (-> this (.getOperationsClient))))

(defn run-asset-discovery-operation-callable
  "Runs asset discovery. The discovery is tracked with a long-running operation.

   This API can only be called with limited frequency for an organization. If it is called too
   frequently the caller will receive a TOO_MANY_REQUESTS error.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     RunAssetDiscoveryRequest request = RunAssetDiscoveryRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     OperationFuture<RunAssetDiscoveryResponse, Empty> future = securityCenterClient.runAssetDiscoveryOperationCallable().futureCall(request);
     // Do something
     RunAssetDiscoveryResponse response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.securitycenter.v1.RunAssetDiscoveryRequest,com.google.cloud.securitycenter.v1.RunAssetDiscoveryResponse,com.google.protobuf.Empty>`"
  ([^SecurityCenterClient this]
    (-> this (.runAssetDiscoveryOperationCallable))))

(defn set-iam-policy-callable
  "Sets the access control policy on the specified Source.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     ResourceName resource = SourceName.of(\"[ORGANIZATION]\", \"[SOURCE]\");
     Policy policy = Policy.newBuilder().build();
     SetIamPolicyRequest request = SetIamPolicyRequest.newBuilder()
       .setResource(resource.toString())
       .setPolicy(policy)
       .build();
     ApiFuture<Policy> future = securityCenterClient.setIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.setIamPolicyCallable))))

(defn update-finding
  "Creates or updates a finding. The corresponding source must exist for a finding creation to
   succeed.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     Finding finding = Finding.newBuilder().build();
     Finding response = securityCenterClient.updateFinding(finding);
   }

  finding - The finding resource to update or create if it does not already exist. parent, security_marks, and update_time will be ignored. In the case of creation, the finding id portion of the name must be alphanumeric and less than or equal to 32 characters and greater than 0 characters in length. - `com.google.cloud.securitycenter.v1.Finding`

  returns: `com.google.cloud.securitycenter.v1.Finding`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.securitycenter.v1.Finding [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.Finding finding]
    (-> this (.updateFinding finding))))

(defn close
  ""
  ([^SecurityCenterClient this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "Returns the permissions that a caller has on the specified source.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     ResourceName resource = SourceName.of(\"[ORGANIZATION]\", \"[SOURCE]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsRequest request = TestIamPermissionsRequest.newBuilder()
       .setResource(resource.toString())
       .addAllPermissions(permissions)
       .build();
     ApiFuture<TestIamPermissionsResponse> future = securityCenterClient.testIamPermissionsCallable().futureCall(request);
     // Do something
     TestIamPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.testIamPermissionsCallable))))

(defn update-security-marks-callable
  "Updates security marks.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     SecurityMarks securityMarks = SecurityMarks.newBuilder().build();
     UpdateSecurityMarksRequest request = UpdateSecurityMarksRequest.newBuilder()
       .setSecurityMarks(securityMarks)
       .build();
     ApiFuture<SecurityMarks> future = securityCenterClient.updateSecurityMarksCallable().futureCall(request);
     // Do something
     SecurityMarks response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.UpdateSecurityMarksRequest,com.google.cloud.securitycenter.v1.SecurityMarks>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.updateSecurityMarksCallable))))

(defn get-iam-policy
  "Gets the access control policy on the specified Source.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     SourceName resource = SourceName.of(\"[ORGANIZATION]\", \"[SOURCE]\");
     Policy response = securityCenterClient.getIamPolicy(resource);
   }

  resource - REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field. - `com.google.cloud.securitycenter.v1.SourceName`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.SourceName resource]
    (-> this (.getIamPolicy resource))))

(defn group-assets
  "Filters an organization's assets and groups them by their specified properties.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     String groupBy = \"\";
     GroupAssetsRequest request = GroupAssetsRequest.newBuilder()
       .setParent(parent.toString())
       .setGroupBy(groupBy)
       .build();
     for (GroupResult element : securityCenterClient.groupAssets(request).iterateAll()) {
       // doThingsWith(element);
     }
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.securitycenter.v1.GroupAssetsRequest`

  returns: `com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupAssetsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.securitycenter.v1.SecurityCenterClient$GroupAssetsPagedResponse [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.GroupAssetsRequest request]
    (-> this (.groupAssets request))))

(defn list-assets
  "Lists an organization's assets.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     ListAssetsRequest request = ListAssetsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     for (ListAssetsResponse.ListAssetsResult element : securityCenterClient.listAssets(request).iterateAll()) {
       // doThingsWith(element);
     }
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.securitycenter.v1.ListAssetsRequest`

  returns: `com.google.cloud.securitycenter.v1.SecurityCenterClient$ListAssetsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.securitycenter.v1.SecurityCenterClient$ListAssetsPagedResponse [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.ListAssetsRequest request]
    (-> this (.listAssets request))))

(defn create-finding
  "Creates a finding. The corresponding source must exist for finding creation to succeed.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     SourceName parent = SourceName.of(\"[ORGANIZATION]\", \"[SOURCE]\");
     String findingId = \"\";
     Finding finding = Finding.newBuilder().build();
     Finding response = securityCenterClient.createFinding(parent, findingId, finding);
   }

  parent - Resource name of the new finding's parent. Its format should be \"organizations/[organization_id]/sources/[source_id]\". - `com.google.cloud.securitycenter.v1.SourceName`
  finding-id - Unique identifier provided by the client within the parent scope. It must be alphanumeric and less than or equal to 32 characters and greater than 0 characters in length. - `java.lang.String`
  finding - The Finding being created. The name and security_marks will be ignored as they are both output only fields on this resource. - `com.google.cloud.securitycenter.v1.Finding`

  returns: `com.google.cloud.securitycenter.v1.Finding`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.securitycenter.v1.Finding [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.SourceName parent ^java.lang.String finding-id ^com.google.cloud.securitycenter.v1.Finding finding]
    (-> this (.createFinding parent finding-id finding)))
  (^com.google.cloud.securitycenter.v1.Finding [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.CreateFindingRequest request]
    (-> this (.createFinding request))))

(defn create-source
  "Creates a source.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     Source source = Source.newBuilder().build();
     Source response = securityCenterClient.createSource(parent, source);
   }

  parent - Resource name of the new source's parent. Its format should be \"organizations/[organization_id]\". - `com.google.cloud.securitycenter.v1.OrganizationName`
  source - The Source being created, only the display_name and description will be used. All other fields will be ignored. - `com.google.cloud.securitycenter.v1.Source`

  returns: `com.google.cloud.securitycenter.v1.Source`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.securitycenter.v1.Source [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.OrganizationName parent ^com.google.cloud.securitycenter.v1.Source source]
    (-> this (.createSource parent source)))
  (^com.google.cloud.securitycenter.v1.Source [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.CreateSourceRequest request]
    (-> this (.createSource request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^SecurityCenterClient this]
    (-> this (.isTerminated))))

(defn group-findings-callable
  "Filters an organization or source's findings and groups them by their specified properties.

   To group across all sources provide a `-` as the source id. Example:
   /v1/organizations/123/sources/-/findings

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     SourceName parent = SourceName.of(\"[ORGANIZATION]\", \"[SOURCE]\");
     String groupBy = \"\";
     GroupFindingsRequest request = GroupFindingsRequest.newBuilder()
       .setParent(parent.toString())
       .setGroupBy(groupBy)
       .build();
     while (true) {
       GroupFindingsResponse response = securityCenterClient.groupFindingsCallable().call(request);
       for (GroupResult element : response.getGroupByResultsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.GroupFindingsRequest,com.google.cloud.securitycenter.v1.GroupFindingsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.groupFindingsCallable))))

(defn create-source-callable
  "Creates a source.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     Source source = Source.newBuilder().build();
     CreateSourceRequest request = CreateSourceRequest.newBuilder()
       .setParent(parent.toString())
       .setSource(source)
       .build();
     ApiFuture<Source> future = securityCenterClient.createSourceCallable().futureCall(request);
     // Do something
     Source response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.CreateSourceRequest,com.google.cloud.securitycenter.v1.Source>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.createSourceCallable))))

(defn get-organization-settings
  "Gets the settings for an organization.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     OrganizationSettingsName name = OrganizationSettingsName.of(\"[ORGANIZATION]\");
     OrganizationSettings response = securityCenterClient.getOrganizationSettings(name);
   }

  name - Name of the organization to get organization settings for. Its format is \"organizations/[organization_id]/organizationSettings\". - `com.google.cloud.securitycenter.v1.OrganizationSettingsName`

  returns: `com.google.cloud.securitycenter.v1.OrganizationSettings`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.securitycenter.v1.OrganizationSettings [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.OrganizationSettingsName name]
    (-> this (.getOrganizationSettings name))))

(defn list-sources-callable
  "Lists all sources belonging to an organization.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     ListSourcesRequest request = ListSourcesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListSourcesResponse response = securityCenterClient.listSourcesCallable().call(request);
       for (Source element : response.getSourcesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.ListSourcesRequest,com.google.cloud.securitycenter.v1.ListSourcesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.listSourcesCallable))))

(defn group-assets-callable
  "Filters an organization's assets and groups them by their specified properties.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     String groupBy = \"\";
     GroupAssetsRequest request = GroupAssetsRequest.newBuilder()
       .setParent(parent.toString())
       .setGroupBy(groupBy)
       .build();
     while (true) {
       GroupAssetsResponse response = securityCenterClient.groupAssetsCallable().call(request);
       for (GroupResult element : response.getGroupByResultsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.GroupAssetsRequest,com.google.cloud.securitycenter.v1.GroupAssetsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.groupAssetsCallable))))

(defn set-finding-state-callable
  "Updates the state of a finding.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     FindingName name = FindingName.of(\"[ORGANIZATION]\", \"[SOURCE]\", \"[FINDING]\");
     Finding.State state = Finding.State.STATE_UNSPECIFIED;
     Timestamp startTime = Timestamp.newBuilder().build();
     SetFindingStateRequest request = SetFindingStateRequest.newBuilder()
       .setName(name.toString())
       .setState(state)
       .setStartTime(startTime)
       .build();
     ApiFuture<Finding> future = securityCenterClient.setFindingStateCallable().futureCall(request);
     // Do something
     Finding response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.SetFindingStateRequest,com.google.cloud.securitycenter.v1.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.setFindingStateCallable))))

(defn create-finding-callable
  "Creates a finding. The corresponding source must exist for finding creation to succeed.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     SourceName parent = SourceName.of(\"[ORGANIZATION]\", \"[SOURCE]\");
     String findingId = \"\";
     Finding finding = Finding.newBuilder().build();
     CreateFindingRequest request = CreateFindingRequest.newBuilder()
       .setParent(parent.toString())
       .setFindingId(findingId)
       .setFinding(finding)
       .build();
     ApiFuture<Finding> future = securityCenterClient.createFindingCallable().futureCall(request);
     // Do something
     Finding response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.CreateFindingRequest,com.google.cloud.securitycenter.v1.Finding>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.createFindingCallable))))

(defn get-organization-settings-callable
  "Gets the settings for an organization.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     OrganizationSettingsName name = OrganizationSettingsName.of(\"[ORGANIZATION]\");
     GetOrganizationSettingsRequest request = GetOrganizationSettingsRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<OrganizationSettings> future = securityCenterClient.getOrganizationSettingsCallable().futureCall(request);
     // Do something
     OrganizationSettings response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.GetOrganizationSettingsRequest,com.google.cloud.securitycenter.v1.OrganizationSettings>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.getOrganizationSettingsCallable))))

(defn list-assets-paged-callable
  "Lists an organization's assets.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     OrganizationName parent = OrganizationName.of(\"[ORGANIZATION]\");
     ListAssetsRequest request = ListAssetsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListAssetsPagedResponse> future = securityCenterClient.listAssetsPagedCallable().futureCall(request);
     // Do something
     for (ListAssetsResponse.ListAssetsResult element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.securitycenter.v1.ListAssetsRequest,com.google.cloud.securitycenter.v1.SecurityCenterClient$ListAssetsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SecurityCenterClient this]
    (-> this (.listAssetsPagedCallable))))

(defn set-finding-state
  "Updates the state of a finding.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     FindingName name = FindingName.of(\"[ORGANIZATION]\", \"[SOURCE]\", \"[FINDING]\");
     Finding.State state = Finding.State.STATE_UNSPECIFIED;
     Timestamp startTime = Timestamp.newBuilder().build();
     Finding response = securityCenterClient.setFindingState(name, state, startTime);
   }

  name - The relative resource name of the finding. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: \"organizations/123/sources/456/finding/789\". - `com.google.cloud.securitycenter.v1.FindingName`
  state - The desired State of the finding. - `com.google.cloud.securitycenter.v1.Finding$State`
  start-time - The time at which the updated state takes effect. - `com.google.protobuf.Timestamp`

  returns: `com.google.cloud.securitycenter.v1.Finding`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.securitycenter.v1.Finding [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.FindingName name ^com.google.cloud.securitycenter.v1.Finding$State state ^com.google.protobuf.Timestamp start-time]
    (-> this (.setFindingState name state start-time)))
  (^com.google.cloud.securitycenter.v1.Finding [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.SetFindingStateRequest request]
    (-> this (.setFindingState request))))

(defn shutdown-now
  ""
  ([^SecurityCenterClient this]
    (-> this (.shutdownNow))))

(defn test-iam-permissions
  "Returns the permissions that a caller has on the specified source.

   Sample code:



   try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
     SourceName resource = SourceName.of(\"[ORGANIZATION]\", \"[SOURCE]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsResponse response = securityCenterClient.testIamPermissions(resource, permissions);
   }

  resource - REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field. - `com.google.cloud.securitycenter.v1.SourceName`
  permissions - The set of permissions to check for the `resource`. Permissions with wildcards (such as '*' or 'storage.*') are not allowed. For more information see [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions). - `java.util.List`

  returns: `com.google.iam.v1.TestIamPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.TestIamPermissionsResponse [^SecurityCenterClient this ^com.google.cloud.securitycenter.v1.SourceName resource ^java.util.List permissions]
    (-> this (.testIamPermissions resource permissions)))
  (^com.google.iam.v1.TestIamPermissionsResponse [^SecurityCenterClient this ^com.google.iam.v1.TestIamPermissionsRequest request]
    (-> this (.testIamPermissions request))))

