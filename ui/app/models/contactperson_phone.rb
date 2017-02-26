class ContactpersonPhone < ActiveRecord::Base
  belongs_to :contactperson
  belongs_to :phone
end
