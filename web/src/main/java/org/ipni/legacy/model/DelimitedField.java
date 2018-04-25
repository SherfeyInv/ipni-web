package org.ipni.legacy.model;

public enum DelimitedField {
	Id("Id", "id"),
	Version("Version", "version"),
	Family("Family", "family"),
	InfraFamily("Infra family", "infrafamily"),
	HybridGenus("Hybrid genus", "hybridGenus"),
	Genus("Genus", "genus"),
	InfraGenus("Infra genus", "infragenus"),
	Hybrid("Hybrid", "hybrid"),
	Species("Species", "species"),
	SpeciesAuthor("Species author", "speciesAuthor"),
	InfraSpecies("Infra species", "infraspecies"),
	Rank("Rank", "rank"),
	Authors("Authors", "authors"),
	BasionymAuthor("Basionym author", "basionymAuthorStr"),
	StandardisedBasionymAuthorFlag("Standardised basionym author flag", "standardisedBasionymAuthorFlag"),
	PublishingAuthor("Publishing author", "publishingAuthor"),
	StandardisedPublishingAuthorFlag("Standardised publishing author flag", "standardisedPublishingAuthorFlag"),
	FullName("Full name", "fullName"),
	FullNameWithoutFamily("Full name without family", "fullName"),
	FullNameWithoutAuthors("Full name without authors", "name"),
	FullNameWithoutFamilyAndAuthors("Full name without family and authors", "name"),
	Reference("Reference", "reference"),
	Publication("Publication", "publication"),
	StandardisedPublicationFlag("Standardised publication flag", "standardisedPublicationFlag"),
	Collation("Collation", "referenceCollation"),
	PublicationYearFull("Publication year full", "publicationYear"),
	PublicationYear("Publication year", "publicationYear"),
	publicationYearNote("publication year note", "publicationYearNote"),
	PublicationYearText("Publication year text", "publicationYear"),
	Volume("Volume", "volume"),
	StartPage("Start page", "startPage"),
	EndPage("End page", "endPage"),
	PrimaryPagination("Primary pagination", "primaryPagination"),
	SecondaryPagination("Secondary pagination", "secondaryPagination"),
	ReferenceRemarks("Reference remarks", "referenceRemarks"),
	NameStatus("Name status", "nameStatus"),
	Remarks("Remarks", "remarks"),
	HybridParents("Hybrid parents", "hybridParents"),
	Basionym("Basionym", "basionymStr"),
	ReplacedSynonym("Replaced synonym", "replacedSynonym"),
	ReplacedSynonymAuthorTeam("Replaced synonym Author team", "replacedSynonymAuthorTeam"),
	NomenclaturalSynonym("Nomenclatural synonym", "nomenclaturalSynonym"),
	OtherLinks("Other links", "otherLinks"),
	SameCitationAs("Same citation as", "sameCitationAs"),
	Distribution("Distribution", "distribution"),
	CitationType("Citation type", "citationType"),
	BibliographicReference("Bibliographic reference", "bibliographicReference"),
	BibliographicTypeInfo("Bibliographic type info", "bibliographicTypeInfo"),
	CollectionDateAsText("Collection date as text", "collectionDateAsText"),
	CollectionDay1("Collection day1", "collectionDay1"),
	CollectionMonth1("Collection month1", "collectionMonth1"),
	CollectionYear1("Collection year1", "collectionYear1"),
	CollectionDay2("Collection day2", "collectionDay2"),
	CollectionMonth2("Collection month2", "collectionMonth2"),
	CollectionYear2("Collection year2", "collectionYear2"),
	CollectionNumber("Collection number", "collectionNumber"),
	CollectorTeamAsText("Collector team as text", "collectorTeam"),
	GeographicUnitAsText("Geographic unit as text", "geographicUnit"),
	Locality("Locality", "locality"),
	LatitudeDegrees("Latitude degrees", "latitudeDegrees"),
	LatitudeMinutes("Latitude minutes", "latitudeMinutes"),
	LatitudeSeconds("Latitude seconds", "latitudeSeconds"),
	NorthOrSouth("North or south", "northOrSouth"),
	LongitudeDegrees("Longitude degrees", "longitudeDegrees"),
	LongitudeMinutes("Longitude minutes", "longitudeMinutes"),
	LongitudeSeconds("Longitude seconds", "longitudeSeconds"),
	EastOrWest("East or west", "eastOrWest"),
	TypeRemarks("Type remarks", "typeRemarks"),
	TypeName("Type name", "typeName"),
	TypeLocations("Type locations", "typeLocations"),
	OriginalTaxonName("Original taxon name", "originalTaxonName"),
	OriginalTaxonNameAuthorTeam("Original taxon name author team", "originalTaxonNameAuthorTeam"),
	OriginalReplacedSynonym("Original replaced synonym", "originalReplacedSynonym"),
	OriginalReplacedSynonymAuthorTeam("Original replaced synonym author team", "originalReplacedSynonymAuthorTeam"),
	OriginalBasionym("Original basionym", "originalBasionym"),
	OriginalBasionymAuthorTeam("Original basionym author team", "originalBasionymAuthorTeam"),
	OriginalParentCitationTaxonNameAuthorTeam("Original parent citation taxon name author team", "originalParentCitationTaxonNameAuthorTeam"),
	OriginalTaxonDistribution("Original taxon distribution", "originalTaxonDistribution"),
	OriginalHybridParentage("Original hybrid parentage", "originalHybridParentage"),
	OriginalCitedType("Original cited type", "originalCitedType"),
	OriginalRemarks("Original remarks", "originalRemarks");

	private String display;
	private String field;

	private DelimitedField(String display, String field) {
		this.display = display;
		this.field = field;
	}

	public String display() {
		return display;
	}

	public String field() {
		return field;
	}
}