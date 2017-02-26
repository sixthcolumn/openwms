class ContactpersonOtherContactinfo < ActiveRecord::Base
  belongs_to :contactperson
  belongs_to :other_contactinfo
end
