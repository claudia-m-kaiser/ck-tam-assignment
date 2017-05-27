import play.filters.csrf.CSRFFilter;
import play.filters.headers.SecurityHeadersFilter;
import play.filters.hosts.AllowedHostsFilter;
import play.http.DefaultHttpFilters;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * This class configures filters that run on every request.
 */

@Singleton
public class Filters extends DefaultHttpFilters {

    @Inject
    public Filters(AllowedHostsFilter allowedHostsFilter,
                   SecurityHeadersFilter securityHeadersFilter) {
        super(allowedHostsFilter, securityHeadersFilter);
    }
}
